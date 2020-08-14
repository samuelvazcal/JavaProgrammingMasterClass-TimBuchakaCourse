public class LargestPrime {
	public static int getLargestPrime (int number) {
		if(number <= 1) {
			return -1;
		}
		int i = 0;
		for(i=2; i <= number; i++) {
			if(number % i == 0) {
				//if we keep dividing the number by prime factor then it will either
				//fully divide the number or produce another prime factor
				//Until eventually the dividend is 1.
				number = number/i;
				i--;
			}
		}
		return i;
	}
}
