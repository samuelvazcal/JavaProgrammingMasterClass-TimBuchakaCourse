public class Main {
	public static void main(String[] args) {
		Wall wall  = new Wall(5,4);

		System.out.println("Area = " + wall.getArea());

		wall.setHeight(-1.5);
		System.out.println("height = " + wall.getHeight());
		System.out.println("width = " + wall.getWidth());
		System.out.println("area = " + wall.getArea());

		wall.setHeight(3.0);
		wall.setWidth(2.5);
		System.out.println("height = " + wall.getHeight());
		System.out.println("width = " + wall.getWidth());
		System.out.println("area = " + wall.getArea());

	}
}
