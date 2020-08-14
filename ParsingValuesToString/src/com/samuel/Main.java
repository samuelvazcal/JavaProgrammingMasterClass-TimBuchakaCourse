package com.samuel;

public class Main {
	public static void main(String[] args) {
		String numberAsString = "2018";
		System.out.println("numberAsString = " +numberAsString);
		int number = Integer.parseInt(numberAsString);
		System.out.println("number = " + number);
		numberAsString += 1;
		number += 1;
		System.out.println("numberAsString = " +numberAsString);
		System.out.println("number = " + number);

		String numberAsStringA = "2018.321";
		double numberA = Double.parseDouble(numberAsStringA);
		System.out.println("numberA = " + numberA);
		numberAsStringA += 1;
		numberA += 1;
		System.out.println("numberAsString = " +numberAsStringA);
		System.out.println("numberA = " + numberA);

	}
}
