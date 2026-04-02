package basic3;

@FunctionalInterface
interface ZeroParam {
	String sayHello();
}

@FunctionalInterface
interface OneParam {
	String printMessage(String s);
}

@FunctionalInterface
interface TwoParam {
	int addNumbers(int a, int b);
}

public class App {

	public static void main(String[] args) {
		ZeroParam param = () -> {
			return "Hello";
		};

		ZeroParam param1 = () -> "Kalpesh";

		System.out.println(param.sayHello());
		System.out.println(param1.sayHello());

		OneParam oneParam1 = (s) -> s.toUpperCase();
		// OR
		OneParam oneParam2 = (s) -> {
			return s.toUpperCase();
		};

		System.out.println(oneParam1.printMessage("kareena"));
		System.out.println(oneParam2.printMessage("raveena"));

		TwoParam twoParam = (x, y) -> {
			return x + y;
		};
		TwoParam param2 = (x, y) -> x + y;

		System.out.println(twoParam.addNumbers(10, 20));
		System.out.println(param2.addNumbers(11, 22));

	}

}
