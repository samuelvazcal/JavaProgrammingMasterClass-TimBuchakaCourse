public class LastDigitChecker {
	public static boolean hasSameLastDigit(int number1, int number2, int number3) {
		if(isValid(number1) && isValid(number2) && isValid(number3)) {
			int extractDigit1 = number1 % 10;
			int extractDigit2 = number2 % 10;
			int extractDigit3 = number3 % 10;
			if((extractDigit1==extractDigit2) || (extractDigit1==extractDigit3) || (extractDigit2==extractDigit3)) {
				return true;
			} else return false;
		}
		else return false;
	}

	public static boolean isValid(int number) {
		if(number>=10&&number<=1000) {
			return true;
		} else return false;
	}
}
