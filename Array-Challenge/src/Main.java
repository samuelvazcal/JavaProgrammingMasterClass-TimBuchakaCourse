import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int integersNumber = 0;
		System.out.println("Enter the number of integers: ");
		integersNumber = scanner.nextInt();
		int [] A = getIntegers(integersNumber);
		int [] B = printArray(A);
		sortIntegers(B);
	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integers for your array: ");
		int [] values = new int[number];
		for(int  i=0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}

	public static int[] printArray(int[] array) {
		System.out.println("The array of integers entered is: \r");
		for(int x:array) {
			System.out.print(x + " ");
		}
		return array;
	}

	public static void sortIntegers(int[] array) {
		System.out.println("\nThe list of integers in descending order is: \r");
		int temp = 0;
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]<array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int x:array) {
			System.out.print(x + " ");
		}
	}


}
