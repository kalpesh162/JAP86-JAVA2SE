package p1;

import java.util.HashMap;
import java.util.Map;

public class App1 {

	public static void main(String[] args) {

		// Map map=new HashMap();
		// Heterogenous Type Allows
		HashMap map = new HashMap();
		System.out.println(map.put(1, "AA"));
		map.put(2, 44);
		map.put(5, 44.44);
		map.put(11, 'A');
		map.put(31, true);
		map.put('A', "AA");
		// ADDing Duplicate Key With diff value
		System.out.println(map.put(1, "BB"));
		System.out.println(map);

		System.out.println("Contains Key  " + map.containsKey(5));
		System.out.println("Contains Value  " + map.containsValue("AA"));

		System.out.println("Contains Key  " + map.containsKey(15));
		System.out.println("Contains Value  " + map.containsValue("AAA"));

		// V put(Object K ,Object V)

		System.out.println("Total Size  " + map.size());
		// void clear()

		// How To GET VALUE

		System.out.println(map.get('A')); // AA
		System.out.println(map.getOrDefault('B', "NOT PRESENT"));
		System.out.println(map.get('B')); // null

		System.out.println("isEmpty "+map.isEmpty());
		
		System.out.println("remove  "+map.remove(1));
		System.out.println("remove  "+map.remove(19));
		//	default boolean	remove(Object key, Object value)
		System.out.println(map.remove(11, 'A'));
		
		//default V	replace(K key, V value)
											//    K    NEW 
		System.out.println("Replace "+map.replace(5, 55.55));
		                                //        K   OLD     NEW             
		System.out.println("Replace "+map.replace(5, 55.55 , 66));
		
		System.out.println(map);
		
	}

}
