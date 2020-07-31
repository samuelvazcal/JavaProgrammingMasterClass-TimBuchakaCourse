public class Main {
	public static void main(String[] args) {
		int count = 1;
		while(count!=6) {
			System.out.println("Count value is " + count);
			count++;
		}

		count = 1;
		while(true) {
			if(count == 5) {
				break;
			}
			System.out.println("Count value: " + count);
			count++;
		}

		count = 1;
		do {
			System.out.println("Count value was " + count);
			count++;
		} while(count != 6);

		System.out.println("\nChallenge!:\n");
		int number = 4;
		int finishNumber = 20;
		while(number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}
			System.out.println("Even number " + number);
		}
	}

	//Create a method called isEvenNumber that takes a parameter of type int
	//Its purposeis is to determine if the argument passed to the method is
	//an even number or not.
	//return true if an even nuber, otherwise return false
	public static boolean isEvenNumber(int number) {
		if((number % 2)==0) {
			return true;
		} else return false;
	}
}
