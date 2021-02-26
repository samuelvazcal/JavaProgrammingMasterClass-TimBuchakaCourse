package com.samuelvazquez;

public class Main {

    public static void main(String[] args) {
        /*
        Implementing a thread with an anonymous class
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the RunnableX via anonymous class");
            }
        }).start();
        /*
        Implementing a thread with an instance
         */
        new Thread(new CodeToRun()).start();

        new Thread(()-> System.out.println("Printing from the Runnable via lambda expression")).start();
    }
}

class CodeToRun implements Runnable{
    @Override
    public void run() {
        System.out.println("Printing from the Runnable via a CodeTuRun instance");
    }
}
