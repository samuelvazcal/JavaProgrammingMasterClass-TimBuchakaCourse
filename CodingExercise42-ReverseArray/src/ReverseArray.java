import java.util.Arrays;


public class ReverseArray {
	public static void reverse(int [] array) {
		int [] swapArray = new int [array.length];
		int bound = array.length;
		System.out.println("Array = " + Arrays.toString(array));
		for(int i = 0; i <array.length; i++) {
			swapArray[bound-1] = array[i];
			bound-=1;
		}
//		for(int x = 0; x < swapArray.length; x++) {
//			System.out.print(swapArray[x] + " ");
//		}
		System.out.println("Reversed array = " + Arrays.toString(swapArray));
	}
}
