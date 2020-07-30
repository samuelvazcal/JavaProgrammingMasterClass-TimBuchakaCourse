public class Main {
	public static void main(String[] args) {
		System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

		for (int i=0; i < 5; i++) {
			System.out.println("Loop " + i + " hello!");
		}
		System.out.println("\nChallenge!: \n");
		//using the for statement, call the calculateInterest method with
		//the amount of 1000 with an interestRate of 2,3,4,5,6,7 and 8
		//and print the results to the console window.

		for(int i=2; i <= 8; i++) {
			double result = calculateInterest(10000,i);
			System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",result));
		}
	}



	public static double calculateInterest(double amount, double interestRate) {
		return (amount*(interestRate/100));
	}
}
