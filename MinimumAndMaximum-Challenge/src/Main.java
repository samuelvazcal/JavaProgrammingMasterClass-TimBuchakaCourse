import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = 0;
		int max = 0;

		while(true) {
			System.out.println("Enter number: ");
			boolean numberBoolean = scanner.hasNextInt();
			if(numberBoolean) {
				int numberValue = scanner.nextInt();
				if(numberValue > max) {
					max = numberValue;
				} else {
					min = numberValue;
				}
			} else {
				break;
			}
			//System.out.println("Min value is : " + min + " and Max value is : " +  max);
		}
		System.out.println("Min value is : " + min + " and Max value is : " +  max);
	}
}

//import java.util.Scanner;


//public class Main {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int min = 0;
//		int max = 0;
//
//		while(true) {
//			System.out.println("Enter number: ");
//			boolean isAnInt = scanner.hasNextInt();
//			if(isAnInt) {
//
//				int number = scanner.nextInt();
//
//				if(number > max) {
//					max = number;
//				}
//				if(number <  min) {
//					min = number;
//				}
//			} else {
//				break;
//			}
//			scanner.nextLine();
//		}
//		System.out.println("min = " + min + ", max = " + max);
//		scanner.close();
//	}
//}
