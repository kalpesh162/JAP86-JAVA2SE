package p2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		// unique Key
		// no order imp
		// to search efficient
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		data.put(11, "Arjun");
		data.put(21, "Arvind");
		data.put(41, "Ashish");
		data.put(15, "Arun");
		data.put(41, "Ravi");
		data.put(71, "Teja");
		// Even we can add as null Key and null as data in HashMap
		System.out.println(data);

		// Unique Key
		// insertion order imp
		LinkedHashMap<Integer, String> data1 = new LinkedHashMap<Integer, String>();
		data1.put(11, "Arjun");
		data1.put(21, "Arvind");
		data1.put(41, "Ashish");
		data1.put(15, "Arun");
		data1.put(41, "Ravi");
		data1.put(71, "Teja");
		// Even we can add as null Key and null as data in HashMap
		System.out.println(data1);

		// Unique Key
		// ASC Order Or DEC Order
		TreeMap<Integer, String> data2 = new TreeMap<Integer, String>();
		data2.put(11, "Arjun");
		data2.put(21, "Arvind");
		data2.put(41, "Ashish");
		data2.put(15, "Arun");
		data2.put(41, "Ravi");
		data2.put(71, "Teja");
		data2.put(51, null);
		//data2.put(null, "Teja");
		// Even we can add as null Key and null as data in HashMap
		System.out.println(data2);
		
		// TreeMap   Comparison 
		// Key Type inside TreeMap tar Key Object must be type of Comparable
		// TreeMap Hetergenous Type are not allow  --> ClassCastException
		// TreeMap you can not add null  --NullPointerException

	}

}
