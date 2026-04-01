package inner;

class Outer {
	private int outerField = 11;

	public void outerFunction() {
		System.out.println("Outer Function " + outerField);
	}

	class Inner {
		private int innerField = 22;

		public void innerFunction() {
			System.out.println("inner Function " + innerField);

			System.out.println("Outer Field " + outerField);
		}
	}

}

public class App {

	public static void main(String[] args) {

		Outer out = new Outer();
		out.outerFunction();

		Outer.Inner in = out.new Inner();

		in.innerFunction();

		//

		Outer.Inner in1 = new Outer().new Inner();
		in1.innerFunction();
	}

}
