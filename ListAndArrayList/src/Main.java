import java.util.Arrays;
import java.util.Scanner;


public class Main {
	private static Scanner s = new Scanner(System.in);
	private static int[] baseData = new int[10];

	public static void main(String[] args) {
		System.out.println("Enter 10 integers: ");
		getInput();
		printArray(baseData);
		resizeArray();
		System.out.println("\nEnter 12 integers: ");
		getInput();
		printArray(baseData);
	}

	private static void getInput() {
		for(int i=0; i < baseData.length; i++)
			baseData[i] = s.nextInt();
	}

	private static void printArray(int[] arr) {
		for(int x:arr) {
			System.out.print(x + " ");
		}
	}

	private static void resizeArray() {
		int [] original = baseData;

		baseData = new int[12];
		for(int i = 0; i <original.length; i++) {
			baseData[i] = original[i];
		}
	}
}
