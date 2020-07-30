public class Main {
	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if((count <= 5) &&(i%3==0)&&(i%5==0)) {
				System.out.println("---> " + i);
				sum += i;
				count++;
			}
			// System.out.println(i);
		}
		System.out.println("Total sum: " + sum);
	}
}
