package p1;

public class App {

	public static void main(String[] args) {
		Point p1 = new Point(11, 22);
		// we want copy of p1
		// Point p2=p1; // its not a copy

		Point p2 = new Point(p1);

		System.out.println(p1.getX() + " " + p1.getY());
		System.out.println(p2.getX() + " " + p2.getY());

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
