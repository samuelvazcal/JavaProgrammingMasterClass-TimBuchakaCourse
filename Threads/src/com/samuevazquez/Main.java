package com.samuevazquez;

import static com.samuevazquez.ThreadColor.*;


public class Main {
	public static void main(String[] args) {
		//application running our code on the main thread
		System.out.println(ANSI_PURPLE + "Hello from the main thread.");
		//creating a thread, creating an instance of a subclass
		Thread anotherThread = new AnotherThread();
		anotherThread.setName("=Another Thread=");
		//enables to jvm to run the run method for the thread
		anotherThread.start();
		//anotherThread.run();

		//another thread as an anonymous class
		new Thread() {
			public void run() {
				System.out.println(ANSI_GREEN + "Hello from anonymous class thread");
			}
		}.start();

		//we can have any class implements runnable interface and then all we have to do is add run method to that class
		//we create an instance of the thread class (not a subclass) but this time we pass an instance of the my runnable class to
		//the thread constructor
		Thread myRunnableThread = new Thread(new MyRunnable());
		myRunnableThread.start();

		//we can also have an anonymous class implements runnable and pass an instance of it
		//to the thread constructor
		Thread myRunnableThread2 = new Thread(new MyRunnable() {
			@Override
			public void run() {
				System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
				try {
					anotherThread.join(2000);
					System.out.println(ANSI_RED + "AnotherThread terminated or timed out, so I'm running again");
				} catch(InterruptedException e) {
					System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
				}
			}
		});
		myRunnableThread2.start();
		//anotherThread.interrupt();

		System.out.println(ANSI_BLUE + "Hello again from the main thread.");

		//using a subclass of thread means that we have to define the run method
		//once but we can't reuse the same instance
		//anotherThread.start();


	}
}
