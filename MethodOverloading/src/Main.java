public class Main {
	public static void main(String[] args) {
		int newScore = calculateScore("Sam",500);
		System.out.println("New score is: " + newScore);
		calculateScore(75);
		calculateScore();

		System.out.println("\nChallenge!: \n");
		System.out.println(calcFeetAndInchesToCentimeters(1,0));
		System.out.println(calcFeetAndInchesToCentimeters(2,8));
		System.out.println(calcFeetAndInchesToCentimeters(0,7));
		System.out.println(calcFeetAndInchesToCentimeters(13,1));
		System.out.println(calcFeetAndInchesToCentimeters(-1,-1));
		System.out.println(calcFeetAndInchesToCentimeters(-2,2));
		System.out.println(calcFeetAndInchesToCentimeters(6,-10));


		//Create a method called calcFeetAndInchesToCentimeters
		//It needs to gave two parameters.
		//feet is the first parameter, inches is the 2nd parameter
		//
		//You should validate that the first parameter feet is >=0
		//You should validate that the 2nd parameter inches is >=0 and <=12
		//return .1 from the method if either of the above is not true
		//
		//If the parameters are valid, then calculate how many centimeters
		//comprise the feet and inches passed to this method and return that value.
		//
		//Create a 2nd method of the same name with only one parameter
		//inches is the parameter
		//validate that its >=0
		//return -1 if it is not true
		//But if its valid, then calculate how many feet are in the inches
		//and then here is the tricky part
		//call the other overloaded method passing the correct feet and inches
		//hints: Use double for your number data types is probably a good idea
		//1 inch = 2.54 cm. and one foot = 12 inches


	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if((feet >= 0) && (inches >= 0 && inches <= 12)) {
			System.out.print(feet + " feet + " + inches + " inches = " );
			return ((feet*12*2.54) + calcFeetAndInchesToCentimeters(inches));
		} else
			System.out.print("Invalid Value(s): ");
			return -1;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches >= 0 && inches <= 12) {
			return inches*2.54;
		} else
			System.out.print("Invalid Value(s): ");
			return -1;
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}
}
