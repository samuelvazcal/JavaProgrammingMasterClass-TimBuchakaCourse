package com.samuelvazquez;

import java.util.ConcurrentModificationException;


/*
Two threads counting down from ten using a count down objet
 */
public class Main {
    public static void main(String[] args) {
        Countdown countdown = new Countdown();
        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");
        t1.start();
        t2.start();
        //we can't guarantee the order or can't predict when each thread will run
        //and when it will be suspended so that the other thread can run 'cause that's
        //based on the operating system
    }

}

class Countdown {
    //heap, is the applications memory that all threads share, every thread has a thread stack
    //and that's memory that only that thread can access,
    //instance variables (fields) JVM allocated it in the heap memory, so threads don't have their
    //own copy of the variable
    //local variables are stored in the thread stack, that means that each thread has its own
    //copy of a local variable. In other words when multiple threads are working with the same
    //object (countdown) they in fact share the same object so they don't have their own copy.
    //So when one thread changes the value of one objects instance variables, the other threads
    //will see the new value from that point forward

    private int i;
    //the process of controlling when threads execute code and therefore when they can access the
    //heap is called synchronization. When a method is synchronized only one thread can execute that a time,
    //and keeps control for these methods class, but no outside of those methods (possible use of instance variable).
    //When working with threads we have to synchronize all areas where we think interference can happen.

    //We want this whole method to run before another thread gets access to
    public synchronized void doCountdown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }

        for(i=10;i > 0; i--) {
            //thread can be suspended between steps
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    //constructor
    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}
