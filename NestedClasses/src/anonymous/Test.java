package anonymous;

interface Popcorn {
	void test();
}

public class Test {

	public static void main(String[] args) {

		// Here A class is creates which has no name but that class implements Popcorn
		// A class which has no name --> Below Code nothing Object

		// class _____ implemets Popcorn {} new ___()
		Popcorn p1 = new Popcorn() {

			@Override
			public void test() {
				System.out.println("SPICY");

			}

		};

		p1.test();

		// Way to call without reference
		new Popcorn() {

			@Override
			public void test() {
				System.out.println("SWEET");

			}
		}.test();
		;

	}

}
