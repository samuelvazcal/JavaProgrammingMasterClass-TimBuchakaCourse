public class NumberPalindrome {
	public static boolean isPalindrome(int number) {
		if(number<0) {
			number*=-1;
		}
		int original = number;
		int reverse = 0;
		while(number>0) {
			int remainingDigit = number % 10;
			reverse = reverse * 10;
			reverse += remainingDigit;
			number /= 10;
		}
		if(original==reverse) {
			return true;
		}
		else return false;
	}
}
