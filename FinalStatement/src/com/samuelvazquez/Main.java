package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		SomeClass one = new SomeClass("one");
		SomeClass two = new SomeClass("two");
		SomeClass three = new SomeClass("three");

		System.out.println(one.getInstanceNumber());
		System.out.println(two.getInstanceNumber());
		System.out.println(three.getInstanceNumber());

		System.out.println(Math.PI);

		int pw = 87654321;
		Password password = new Password(pw);
		password.storePassword();

		password.letMeIn(2);
		password.letMeIn(4564564);
		password.letMeIn(9323);
		password.letMeIn(87654321);
	}
}
