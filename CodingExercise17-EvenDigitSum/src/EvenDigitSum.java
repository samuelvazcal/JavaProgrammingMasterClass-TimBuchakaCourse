public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		if(number >= 0) {
			if(number==0)
				return 0;
			int counter = 0;
			while(number > 0) {
				int lsd = number % 10;
				if((lsd % 2) == 0) {
					counter+=lsd;
					number/=10;
				} else number/=10;
			}
			return counter;
		} else return -1;
	}
}
