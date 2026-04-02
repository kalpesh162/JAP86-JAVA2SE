package basic;

@FunctionalInterface
interface Hello {
	void sayHello();
}
/*
 * class A implements Hello {
 * 
 * public void sayHello() { System.out.println("Hello Hello");
 * 
 * }
 * 
 * }
 */

public class App {
	public static void main(String[] args) {
		// () -> { }
		// Hello h1=new A();
		// h1.sayHello();

		Hello h1 = () -> System.out.println("Hello Hello");

		h1.sayHello();

	}
}
