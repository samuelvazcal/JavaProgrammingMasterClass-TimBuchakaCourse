public class AreaCalculator {
	public static double area(double radius) {
		if(radius >= 0) {
			return Math.PI*radius*radius;
		} else return -1.0;
	}
	public static double area(double x, double y) {
		if(x >= 0 && y >= 0) {
			return x*y;
		} else return -1.0;
	}
}
