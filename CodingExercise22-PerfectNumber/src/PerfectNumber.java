public class PerfectNumber {
	public static boolean isPerfectNumber(int number) {
		int count = 1;
		int sum = 0;
		if(number > 1) {
			while(count < number) {
				if(number%count==0) {
					//System.out.println(count);
					//just in case you want to see every proper positive divisor
					sum+=count;
					if(sum==number) {
						return true;
					}
				}
				count+=1;
			}return false;
		}
		else return false;
	}
}
