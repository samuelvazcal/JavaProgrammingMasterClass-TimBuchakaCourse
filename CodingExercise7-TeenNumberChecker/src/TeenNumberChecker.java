public class TeenNumberChecker {
	public static boolean hasTeen(int param1, int param2, int param3) {
		if((param1 >= 13 && param1 <= 19) || (param2 >= 13 && param2 <= 19) || (param3 >= 13 && param3 <= 19)){
			return true;
		} else return false;
	}

	public static boolean isTeen(int paramX) {
		if(paramX >= 13 && paramX <= 19) {
			return true;
		} else return false;
	}
}
