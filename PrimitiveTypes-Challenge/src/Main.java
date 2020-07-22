public class Main {
	public static void main(String[] args) {
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;

		long longTotal = 50000 + 10 * (byteValue + shortValue + intValue);
		System.out.println(longTotal);

		//PLUS
		//Just in case you may want to apply casting to a short variable
		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
	}
}
