package methodref;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class App {

	public static void main(String[] args) {

		List<String> books = Arrays.asList("JAVA", ".NET", "GO", "RUST");

		Consumer<String> printBooks = (String name) -> System.out.println(name);

		//

		books.forEach(printBooks);
		System.out.println("_______________________________");
		books.forEach((String name) -> System.out.println(name));
		System.out.println("_______________________________");
		books.forEach(System.out::println); // Method Reference refering to instance Method

		PrintStream ps = System.out; // fixed Object

		books.forEach(ps::println);

		System.out.println("__________________________");

		books.forEach((name) -> System.out.println(name.toLowerCase()));
		System.out.println("__________________________");
		books.forEach(String::toLowerCase);
		/*
		 * public void accept(String s) { s.toLowerCase(); }
		 */

		System.out.println(" ------------  ");
		int num1 = 11;
		int num2 = 22;

		int res = Integer.max(num1, num2);

		System.out.println(res);

		// Integer::max

		// ArrayList<Integer>list=new ArrayList<Integer>();
		// Supplier

		Supplier<ArrayList<Integer>> list = () -> {
			return new ArrayList<Integer>();
		};

		Supplier<ArrayList<Integer>> list1 = () -> new ArrayList<Integer>();

		Supplier<ArrayList<Integer>> list2 = ArrayList::new;
		// Method reference to Constructor

	}

}
