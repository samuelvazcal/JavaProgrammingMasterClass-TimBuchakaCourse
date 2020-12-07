package com.samuelvazquez;
import java.util.Scanner;


public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Type the size of the array: ");
		int size = scanner.nextInt();
		scanner.nextLine();
		int [] array = SortedArray.getIntegers(size);
		SortedArray.printArray(array);
		SortedArray.sortIntegers(array);
	}
}
