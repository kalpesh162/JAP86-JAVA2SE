package basic2;

@FunctionalInterface
interface ZeroParam {
	void sayHello();
}

@FunctionalInterface
interface OneParam {
	void printMessage(String s);
}

@FunctionalInterface
interface TwoParam {
	void addNumbers(int a, int b);
}

public class App {

	public static void main(String[] args) {

		// Anonymous Inner Class
		ZeroParam z1 = new ZeroParam() {
			@Override
			public void sayHello() {
				System.out.println("Hello HELLO");
			}
		};
		z1.sayHello();

		// Lambda Expression () -> { }

		ZeroParam z2 = () -> System.out.println("HELLO HELLO HELLO");

		z2.sayHello();
	}

}
