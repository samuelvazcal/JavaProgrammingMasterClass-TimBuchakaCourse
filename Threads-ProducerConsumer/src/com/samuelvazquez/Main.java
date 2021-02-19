package com.samuelvazquez;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();

    }
}

class Message {
    private String message;
    private boolean empty = true;

    //will be user by the consumer to read the message
    //synchronized cause we don't want the reader thread to run while the writer thread is writing a message and viceversa
    public synchronized String read() {
        while(empty) {
            try {
                //we always want to call wait within a loop so that when it returns because there's
                //been a notification of some sort, we'll go back to the beginning of the loop
                //Never assume that a thread has been woken up because that it's waiting on has changed
                wait();
            } catch(InterruptedException e) {

            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    //will be used by the producer to write a message
    public synchronized void write(String message) {
        while(!empty) {
            try {
                wait();
            } catch(InterruptedException e) {

            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

//Producer
class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String messages[] = {
              "Sentence 1",
              "Sentence 2",
              "Sentence 3",
              "Sentence 4"
        };

        Random random = new Random();
        for(int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e) {
                System.out.println("exception!!!");
            }
        }
        message.write("Finished!");
    }
}

//Consumer
class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for(String latestMessage = message.read(); !latestMessage.equals("Finished");
            latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e) {

            }
        }
    }
}
