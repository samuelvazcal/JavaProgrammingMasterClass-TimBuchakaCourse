import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your year of birth: ");
		String yearOfBirth = scanner.nextLine();
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		int age = 2020 - Integer.parseInt(yearOfBirth);
		System.out.println("Your name is " + name + " and you are " + age + " years old.");
		scanner.close();
	}
}
