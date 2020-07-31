public class FactorPrinter {
	public static void printFactors(int number) {
		if(number>=1) {
			int i = 1;
			while(i<=number) {
				if(number % i == 0) {
					System.out.print(i + " ");
				}
				i++;
			}
		} else
			System.out.println("Invalid Value");
	}
}
