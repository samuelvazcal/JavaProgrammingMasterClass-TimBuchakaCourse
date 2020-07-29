public class Main {
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	public static void main(String[] args) {
		System.out.println("First overloaded method:");
		getDurationString(80,32);
		getDurationString(64,90);
		getDurationString(62,7);
		getDurationString(124,10);
		System.out.println("Second overloaded method:");
		getDurationString(3945);
		getDurationString(216000);
		getDurationString(61);
		getDurationString(6227);
		getDurationString(-8);

	}

	public static void getDurationString(int minutes, int seconds) {
		if((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
			int hours = minutes / 60;
			int remainingMinutes = minutes % 60;
			System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s");
		} else
			System.out.println(INVALID_VALUE_MESSAGE);
	}
	public static void getDurationString(int seconds) {
		if(seconds >= 0) {
			int minutes = seconds / 60;
			int remainingSeconds = seconds % 60;
			getDurationString(minutes,remainingSeconds);
		} else
		System.out.println(INVALID_VALUE_MESSAGE);
	}
}
