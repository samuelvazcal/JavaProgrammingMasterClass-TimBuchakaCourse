package com.samuelvazquez;

import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
		System.out.println("Minimum Element");
		int min = MinimumElement.readInteger();
		System.out.println("Size of the array is: " + min);
		int [] array = MinimumElement.readElements(min);
		System.out.println(Arrays.toString(array));
		System.out.println("Min value is: " + MinimumElement.findMin(array));
	}
}
