package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(11);
		numbers.add(21);
		numbers.add(31);
		numbers.add(51);
		numbers.add(61);

		System.out.println(numbers.get(2));
		// System.out.println("What YOU SET --> "+numbers.set(4, 99));
		numbers.add(4, 99);

		System.out.println(numbers);

		// substring = sublist
		List<Integer> list = numbers.subList(2, 5); // List subList
		System.out.println(list);

		// How to use Iterator
		System.out.println("=============================");
		Iterator<Integer> itr = numbers.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=============================");
		//

		ListIterator<Integer> litr = numbers.listIterator();

		while (litr.hasNext()) {
			System.out.print(litr.next() + "  ");
		}
		System.out.println();
		System.out.println("-----------------------------------");

		// tell listertaor last element or in another way total size of collection
		ListIterator<Integer> litr2 = numbers.listIterator(numbers.size());
		while (litr2.hasPrevious()) {
			System.out.print(litr2.previous() + "  ");
		}

	}
}
