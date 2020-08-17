import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("Type number " + i + " please: ");
			boolean numberBoolean = scanner.hasNextInt();
			if(numberBoolean) {
				String number = scanner.nextLine();
				int numberValue = Integer.parseInt(number);
				total = total + numberValue;
			} else {
				System.out.println("Invalid Value!");
				i--;
				scanner.nextLine();
			}
		}
		System.out.println("Total: " + total);
		scanner.close();
	}
}
