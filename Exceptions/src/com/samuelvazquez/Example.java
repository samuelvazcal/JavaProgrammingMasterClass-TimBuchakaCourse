package com.samuelvazquez;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Example {
	public static void main(String[] args) {
		try {
			int result = divide();
			System.out.println(result);
		} catch(ArithmeticException | NoSuchElementException e) {
			System.out.println(e.toString());
			System.out.println("Unable to perform division, autopilot shutting down");
		}

	}

	private static int divide() {
		//Division by zero no possible - ArithmeticException
		//Invalid string -> InputMismatchException
		int x, y;
		//try {
		x = getInt();
		y = getInt();
		System.out.println("x is " + x + ", y is " + y);
		return x / y;
			//When an exception happens each of the catch block is checked in order to see if one of them handles
			//the particular exception
		//} catch (NoSuchElementException e) {
			//To throw an exception we create a new exception object and use the throw statement
			//generally you should try to be specific as possible and use an appropriate subclasses exception rather
		//	throw new ArithmeticException("no suitable input");
		//} catch(ArithmeticException e) {
		//	throw new ArithmeticException("attempt to divide by zero");
		//}
	}

	private static int getInt() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an integer");
		while(true) {
			try {
				return s.nextInt();
			} catch(InputMismatchException e) {
				//go round again. Read past the end of line in the input first
				//to basically read passing the lines so we can actually start fresh
				s.nextLine();
				System.out.println("Please enter a number using only the digits 0 to 9");
			}
		}
	}
}
