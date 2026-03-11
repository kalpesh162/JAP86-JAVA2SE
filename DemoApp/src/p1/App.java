package p1;

public class App {

	public static void main(String[] args) {

		Point p1 = new Point(11, 22);
		Point p2 = new Point(11, 22);
		
		
		// is p1 and p2 both are same 
		
		if(p1.equals(p2))
			System.out.println("SAME");
		else
			System.out.println("NOT SAME");

	}

}
