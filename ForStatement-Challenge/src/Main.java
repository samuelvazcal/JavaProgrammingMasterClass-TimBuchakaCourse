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

		System.out.println("\nChallenge 2!: \n");
		//How would you modify the foor loop above to do the same thing as
		//shown but to start from 8% and work back to 2%

		for(int i=8; i >= 2; i--) {
			double result = calculateInterest(10000,i);
			System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",result));
		}

		int count = 0;
		for(int i =1; i<50; i++) {
			if(isPrime(i)) {
				count++;
				System.out.println("Number " + i + " is a prime number");
				if(count == 15) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
	}


	//Create a for statement using any range of numbers
	//Determine if the number is a prime number using the isPrime method
	//if it is a prime number, print it out, AND increment a count of the
	//number of prime numbers found
	//if that count is 3 exit the foor loop
	//hint: Use the break; statement to exit.
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}


	public static double calculateInterest(double amount, double interestRate) {
		return (amount*(interestRate/100));
	}
}
