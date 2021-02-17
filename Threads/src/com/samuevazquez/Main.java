package com.samuevazquez;

import static com.samuevazquez.ThreadColor.*;


public class Main {
	public static void main(String[] args) {
		//application running our code on the main thread
		System.out.println(ANSI_PURPLE + "Hello from the main thread.");
		//creating a thread, creating an instance of the Thread class
		//creating a thread, creating an instance of a subclass
		Thread anotherThread = new AnotherThread();

		//enables to jvm to run the run method for the thread
		anotherThread.start();

		//another thread as an anonymous class
		new Thread() {
			public void run() {
				System.out.println(ANSI_GREEN + "Hello from anonymous class thread");
			}
		}.start();

		System.out.println(ANSI_BLUE + "Hello again from the main thread.");

		//using a subclass of thread means that we have to define the run method
		//once but we can't reuse the same instance
		//anotherThread.start();


	}
}
