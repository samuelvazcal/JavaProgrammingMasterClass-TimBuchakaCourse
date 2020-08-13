import java.util.NavigableMap;


public class Main {
	public static void main(String[] args) {
		NumberToWords.numberToWords(3);
		NumberToWords.numberToWords(-1);
		NumberToWords.numberToWords(29);
		System.out.println();
		NumberToWords.numberToWords(2019);
		NumberToWords.numberToWords(10);
		NumberToWords.numberToWords(-2521);
		NumberToWords.numberToWords(251);
		System.out.println();
		System.out.println("reverse method");
		System.out.println(NumberToWords.reverse(123));
		System.out.println(NumberToWords.reverse(781));
		//System.out.println(NumberToWords.reverse(25));
		//System.out.println(NumberToWords.reverse(-2521));
		System.out.println(NumberToWords.reverse(-2));
		System.out.println(NumberToWords.reverse(-2521));

		System.out.println();
		System.out.println("getDigitCount method");
		System.out.println(NumberToWords.getDigitCount(1234));
		System.out.println(NumberToWords.getDigitCount(678));
		System.out.println(NumberToWords.getDigitCount(25));
	}
}
