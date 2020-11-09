import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of integers for your array: ");
		int count = scanner.nextInt();
		int [] A = getIntegers(count);
		System.out.println("This is your original array:");
		for (int x: A) {
			System.out.print(x + " ");
		}
		System.out.println("\nThis is your reversed array:");
		reverse(A);
	}

	public static int [] getIntegers(int count) {
		int [] array = new int [count];
		System.out.println("Enter " + count + " integers, please:");
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public static void reverse(int [] array) {
		int [] newArray = new int[array.length];
		int bound = array.length;
		for(int i = 0; i < array.length ; i++) {
			newArray[bound-1] = array[i];
			bound -=1;
		}
		for(int x: newArray) {
			System.out.print(x + " ");
		}
	}
}
