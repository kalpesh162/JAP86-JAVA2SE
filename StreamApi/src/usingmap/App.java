package usingmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Map<Integer, String> actors = new HashMap<Integer, String>();
		actors.put(1, "Rajni");
		actors.put(2, "Rajesh");
		actors.put(3, "Rahul");
		actors.put(4, "Radhe");
		actors.put(5, "Arjun");

		// Set<Map.Entry<Integer, String>> entry=actors.entrySet();

		for (Entry<Integer, String> entry : actors.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		System.out.println("++++++++++++++++++++++++++++++++++++");
		Set<Map.Entry<Integer, String>> entry = actors.entrySet();

		for (Map.Entry<Integer, String> entry1 : entry) {
			System.out.println(entry1.getKey() + "  " + entry1.getValue());
		}

		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();
		// Keys
		for (Integer keys : actors.keySet())
			System.out.print(keys + "  ");

		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++");

		Set<Integer> keys = actors.keySet();

		for (Integer val : keys)
			System.out.print(val + "  ");

		System.out.println();

		System.out.println("++++++++++++++++++++++++++++++++++++");

		actors.entrySet().forEach((entry2) -> System.out.println(entry2.getKey() + "  " + entry2.getValue()));
		System.out.println("++++++++++++++++++++++++++++++++++++");

		actors.forEach((key, value) -> System.out.println(key + " " + value));

		// actors -- MAP -- forEach(BiConsumer) --> accept(T t, U u)
		// forEach(BiConsumer)
		System.out.println("****************************");

		actors.entrySet().forEach(System.out::println);

	}

}
