public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor(int first, int second) {
		int gcd = 0;
		int i = 1;
		if(first >= 10 && second >= 10) {
			while((i<=first) && (i<=second)) {
				if(first%i==0 && second%i==0) {
					gcd = i;
					i++;
				}
				else i++;
			}
			return gcd;
		} else return -1;
	}
}
