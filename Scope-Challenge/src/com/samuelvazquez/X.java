package com.samuelvazquez;

import java.util.Scanner;
/*
This challenge was made it following  the Tim's rules in the respective video
Any apparently bad practice was in accordance with the instructions ;)
 */

public class X {
	private int x;

	public X(Scanner x) {
		System.out.println("Please enter a number: ");
		this.x = x.nextInt();
	}

	public void x() {
		for(int x = 1; x < 13; x++) {
			System.out.println(x + " times " + this.x + " equals " + x * this.x);
		}
	}
}
