package p1;

// public class java.lang.Object { 

// protected Object clone() throws CloneNotSupportedException
//  }

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {

		Point p1 = new Point(11, 22);

		Point p2 = (Point) p1.clone();
		// clone() -- internally het you want clone
		// are you a type clonable
		// internally Object creates
		// then rest data of an Object is copy

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
