package p2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Product: Laptop - Tags: Electronics, Gadgets, Tech
Product: Camera - Tags: Electronics, Photography, Tech
Product: Shoes - Tags: Fashion, Footwear, Sports

Map<String, Set<String>>
 */
public class App {

	public static void main(String[] args) {
		Map<String, Set<String>> productNameWithLable = new HashMap<String, Set<String>>();

		Set<String> labels1 = new HashSet<String>();
		labels1.add("Electronics");
		labels1.add("Gadgets");
		labels1.add("Tech");

		Set<String> labels2 = new HashSet<String>();
		labels2.add("Electronics");
		labels2.add("Photography");
		labels2.add("Tech");

		Set<String> labels3 = new HashSet<String>();
		labels3.add("Fashion");
		labels3.add("Footwear");
		labels3.add("Sports");

		productNameWithLable.put("Laptop", labels1);
		productNameWithLable.put("Camera", labels2);
		productNameWithLable.put("Shoes", labels3);

		printProductWithAllLables(productNameWithLable);

	}

	private static void printProductWithAllLables(Map<String, Set<String>> productNameWithLable) {

		// Map.Entry<String, Set<String>> allLables=(Entry<String, Set<String>>)
		// productNameWithLable.entrySet();
		//Set set=productNameWithLable.entrySet();
		
		//Set<Map.Entry<String,Set<String>>> all=productNameWithLable.entrySet();
		
		for (Map.Entry<String, Set<String>> allLables :  productNameWithLable.entrySet()) {
			System.out.println(allLables.getKey() +" -->  "+ allLables.getValue());
		}

	}

}
