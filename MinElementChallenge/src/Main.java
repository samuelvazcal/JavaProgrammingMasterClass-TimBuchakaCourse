import java.util.Scanner;


public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int count = 0;
		System.out.println("How many integers you need to enter?");
		count = scanner.nextInt();
		int [] A = readIntegers(count);
		System.out.println("\nThe minimum value is: " + findMin(A));
	}

	public static int [] readIntegers(int count) {
		int [] array = new int [count];
		//		System.out.println("How many integers you need to enter?");
		//		count = scanner.nextInt();
		System.out.println("Enter " + count + " integers, please:");
		for(int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("The integers you have entered: ");
		for (int x: array) {
			System.out.print(x + " ");
		}
		return array;
	}

	public static int findMin(int [] array) {
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
}
