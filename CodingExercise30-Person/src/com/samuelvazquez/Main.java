package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("Samuel");
		person.setLastName("Vazquez");
		person.setAge(29);
		System.out.println("Fullname = " + person.getFullName());
		System.out.println("Teen = " + person.isTeen());
		person.setFirstName("Andrea");
		person.setAge(26);
		System.out.println("Fullname = " + person.getFullName());
		System.out.println("Teen = " + person.isTeen());
		person.setLastName("Belmonte");
		System.out.println("Fullname = " + person.getFullName());

	}
}
