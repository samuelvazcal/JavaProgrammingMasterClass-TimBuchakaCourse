public class SharedDigit {
	public static boolean hasSharedDigit(int number1, int number2) {
		if((number1>=10&&number1<=99) &&(number2>=10&&number2<=99)) {
			int extractDigit1 = 0;
			int extractDigit2 = 0;;
			int extractDigit3 = 0;;
			int extractDigit4 = 0;;
			while(number1>=10) {
				extractDigit1 = number1 % 10;
				number1 /= 10;
				extractDigit2 = number1 % 10;
			}
			while(number2>=10) {
				extractDigit3 = number2 % 10;
				number2 /= 10;
				extractDigit4 = number2 % 10;
			}
			if((extractDigit1 == extractDigit3)||(extractDigit1 == extractDigit4)) {
				return true;
			} else if((extractDigit2 == extractDigit3)||(extractDigit2 == extractDigit4)) {
				return true;
			} else return false;
		} else return false;
	}
}
