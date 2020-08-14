public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		int totalBigCount = bigCount*5;
		int totalSmallCount = smallCount;
		int total = totalBigCount + totalSmallCount;
		if(goal>total) {
			return false;
		} else if((goal%5)>smallCount) {
			return false;
		} else
		return true;
	}
}
