package com.samuevazquez;

import static com.samuevazquez.ThreadColor.ANSI_BLUE;
import static com.samuevazquez.ThreadColor.ANSI_CYAN;


public class AnotherThread extends Thread{
	@Override
	public void run() {
		//System.out.println(ANSI_CYAN + "Hello from another thread. *");
		System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(ANSI_BLUE + "Another thread woke me up");
			return;
		}
		System.out.println(ANSI_BLUE + "five seconds have passed and I'm awake");
	}
}
