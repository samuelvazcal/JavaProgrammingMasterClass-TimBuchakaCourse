package com.samuelvazquez;

import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("Sam",32.64);
		Customer anotherCustomer = customer;
		anotherCustomer.setBalance(25.93);
		System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(2);
		intList.add(4);
		intList.add(6);
		intList.add(8);
		intList.add(10);

		for(int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}

		intList.add(1,777);

		System.out.println("\n");
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}

		intList.remove(1);

		System.out.println("\n");
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
	}
}
