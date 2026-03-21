package p3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		HashMap<Integer, String> data = new HashMap<Integer, String>();
		data.put(11, "Arjun");
		data.put(21, "Arvind");
		data.put(41, "Ashish");
		data.put(15, "Arun");
		data.put(71, "Ashsih");

		System.out.println(data);

		Set<Integer> keys = data.keySet();

		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("ALL VALUES");

		Collection<String> names = data.values();
		// ArrayList<String> list=new ArrayList<String>(names);
		Iterator<String> itr1 = names.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("----------------------");

		Set set = data.entrySet();

		Iterator itr3 = set.iterator();

		while (itr3.hasNext()) {
			System.out.println(itr3.next()); // itr.next() Entry
		}

		// 21=Arvind ENTRY

		// 21=Arvind ENTRY
		// KEY VALUE

		// Entry

		System.out.println("+++++++++++++++++++++++++++++++++++");

		Set<Entry<Integer, String>> entries = data.entrySet();

		Iterator<Entry<Integer, String>> itr4 = entries.iterator();

		while (itr4.hasNext()) {
			// System.out.println(itr4.next()); // itr4.next() type ? Entry --> Entry Object
			// Print Karatana
			// toString() method "11=Arjun"

			Map.Entry<Integer, String> entry = itr4.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());

		}
		// "11=Arjun"
		// 11
		// Arjun

		System.out.println("+++++++++++++++++++++++++++++++++++");

	}

}
