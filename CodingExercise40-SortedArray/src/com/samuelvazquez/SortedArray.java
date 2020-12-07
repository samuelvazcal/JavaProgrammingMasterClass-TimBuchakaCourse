package com.samuelvazquez;

import java.util.Arrays;
import java.util.Scanner;


public class SortedArray {

	public static int[] getIntegers(int size) {
		Scanner scanner = new Scanner(System.in);
		int [] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter value " + (i+1) + ": ");
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public static void printArray(int [] array) {
		int [] newArray = Arrays.copyOf(array,array.length);
		for(int i = 0; i <array.length; i++) {
			System.out.println("Element " + i + " contents " + newArray[i]);
		}
	}

	public static int[] sortIntegers(int [] unsortedArray) {
		int [] array = Arrays.copyOf(unsortedArray,unsortedArray.length);
		Arrays.sort(array);
		int [] sortedArray = new int [array.length];
		int bound = array.length;
		for(int i = 0; i<array.length; i++) {
			sortedArray[bound-1] = array[i];
			bound-=1;
		}
		for(int x = 0; x < sortedArray.length; x++) {
			System.out.print(sortedArray[x] + " ");
		}
		return sortedArray;
	}
}
