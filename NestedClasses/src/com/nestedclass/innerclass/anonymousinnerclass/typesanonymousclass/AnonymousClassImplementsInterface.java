package com.nestedclass.innerclass.anonymousinnerclass.typesanonymousclass;

public class AnonymousClassImplementsInterface {
	public static void main(String[] args) {
		//Implementing interface Runnable
		//The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("a thread from an anonymous class that implements Runnable");
			}
		};
		//If we don't extend the Thread class, r would not be treated as a thread object.
		// We need to explicitly create Thread class object. We are passing r so its run method may execute
		Thread t = new Thread(r);
		t.start();

	}

}
