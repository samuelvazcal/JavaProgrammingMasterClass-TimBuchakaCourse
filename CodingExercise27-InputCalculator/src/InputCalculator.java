import java.util.Scanner;


public class InputCalculator {
	public static void inputThenPrintSumAndAverage(){
		int number = 0;
		int total = 0;
		int count = 0;
		int avg = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			boolean numberBoolean = scanner.hasNextInt();
			if(numberBoolean) {
				number = scanner.nextInt();
				total = total + number;
				count++;
			} else {
				avg = Math.round(total/count);
				break;
			}
		}
		System.out.println("SUM = " + total + " AVG = " + avg);
	}
}

