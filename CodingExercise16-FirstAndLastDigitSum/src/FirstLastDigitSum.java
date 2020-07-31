public class FirstLastDigitSum {
	public static int sumFirstAndLastDigit(int number) {
		if(number >= 0) {
			if (number == 0) {
				return number;
			} else if (number < 10) {
				return number+number;
			}
			int sum = 0;
			int firstDigit = 0;
			int lastDigit = number % 10;
			while(number > 0) {
				if(number < 10) {
					firstDigit = number;
				}
				number /= 10;
			}
			sum = firstDigit + lastDigit;
			return sum;
		} else return -1;
	}
}
