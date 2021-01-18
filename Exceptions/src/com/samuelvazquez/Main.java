package com.samuelvazquez;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//		int x = 8;
		//		int y = 0;
		//		System.out.println(divideLBYL(x,y));
		//		System.out.println(divideLBYL(x,y));
		//		System.out.println(divide(x,y));
		//	}
		//
		//	private static int divideLBYL(int x, int y) {
		//		if(y!=0) {
		//			return x/y;
		//		} else {
		//			return 0;
		//		}
		//	}
		//
		//	private static int divideEAFP(int x, int y) {
		//		try {
		//			return x/y;
		//		} catch (ArithmeticException e) {
		//			return 0;
		//		}
		//	}
		//
		//	private static int divide(int x, int y) {
		//		return x/y;
		//	}

		//It will throws an InputMismatchException exception if I type an string with non-numerical characters
		//int x = getInt();
		//System.out.println("x is " + x);

		//Now using exceptions
		//Look before you leap
		System.out.println();
		int y = getIntLBYL();
		System.out.println("y is " + y);
		//Easy to ask forgiveness than permission
		System.out.println();
		int z = getIntEAFP();
		System.out.println("z is " + z);
	}

	private static int getInt(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private static int getIntLBYL() {
		Scanner s1 = new Scanner(System.in);
		boolean isValid = true;
		System.out.println("Please enter an integer");
		String input = s1.next();
		for(int i = 0; i<input.length();i++) {
			if(!Character.isDigit(input.charAt(i))) {
				isValid = false;
				break;
			}
		}
		if(isValid) {
			return Integer.parseInt(input);
		}
		return 0;
	}

	private static int getIntEAFP() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an integer");
		try {
			return s.nextInt();
		} catch(InputMismatchException e) {
			return 0;
		}
	}
}
