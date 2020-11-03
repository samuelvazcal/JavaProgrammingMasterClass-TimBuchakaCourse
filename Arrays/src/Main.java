public class Main {
	public static void main(String[] args) {
		int[] myIntArray = new int[20];
		//		int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//		myIntArray[0] = 0;
//		myIntArray[1] = 10;
//		myIntArray[5] = 50;
		for(int i = 0; i<myIntArray.length ; i++){
			myIntArray[i] = i*10;
		}
		printArray(myIntArray);

//		double[] myDoubleArray = new double [10];
//		System.out.println(myIntArray[2]);
//		System.out.println(myIntArray[4]);
//		System.out.println(myIntArray[8]);
	}
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Element" + i + ", value is " + array[i]);
		}
	}
}
