package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
	public static void printShoppingLists(List<Set<String>> shoppingBag) {
		for (int i = 0; i < shoppingBag.size(); i++) {
			Set<String> bag = shoppingBag.get(i);
			System.out.println(i + "   " + bag);
		}
	}

	public static void main(String[] args) {
		List<Set<String>> shoppingBag = new ArrayList<Set<String>>();
		Set<String> items = new HashSet<String>();
		items.add("Laptop");
		items.add("Phone");
		items.add("Tablet");

		Set<String> items1 = new HashSet<String>();
		items1.add("Camera");
		items1.add("Laptop");
		items1.add("HeadPhones");

		Set<String> items2 = new HashSet<String>();
		items2.add("Phone");
		items2.add("Camera");
		items2.add("Shoes");
		shoppingBag.add(items);  // function Call
		shoppingBag.add(items1);
		shoppingBag.add(items2);

		printShoppingLists(shoppingBag);

	}

}
