package staticinner;

class Outer {
	private int outerField = 11;

	public void outerFunction() {
		System.out.println("Outer Function " + outerField);
	}

	static class Inner {
		private int innerField = 22;

		public void innerFunction() {
			System.out.println("inner Function " + innerField);
//			System.out.println("Outer Function " + outerField);
			

		}
	}

}

// LinkedList

public class App {

	public static void main(String[] args) {

		Outer.Inner in = new Outer.Inner();

		in.innerFunction();

	}

}
