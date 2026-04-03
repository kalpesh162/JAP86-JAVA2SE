package basic4;

import java.util.function.Consumer;

//Print whether a number is even or odd.
public class EvenOdd {

	public static void main(String[] args) {

		Consumer<Integer> check = (Integer i) -> {

			if (i % 2 == 0)
				System.out.println("EVEN");
			else
				System.out.println("ODD");
		};

		check.accept(23);

		Consumer<Integer> isEvenOdd = i -> {
			if (i % 2 == 0)
				System.out.println("EVEN");
			else
				System.out.println("ODD");
		};

		isEvenOdd.accept(44);

	}

}
