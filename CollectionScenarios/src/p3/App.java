package p3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Set<Map<String, String>> bio = new HashSet<Map<String, String>>();

		HashMap<String, String> details1 = new HashMap<String, String>();
		details1.put(" Deepika Padukone", "Lead Actress");
		details1.put("  Alia Bhatt ", "Supporting Actress");

		HashMap<String, String> details2 = new HashMap<String, String>();
		details1.put("Nora Fatehi", "Choreographer");
		details1.put(" Madhuri Dixit", "Classical Dance Lead");

		HashMap<String, String> details3 = new HashMap<String, String>();
		details1.put(" Shilpa Shetty ", "Yoga Trainer");
		details1.put("Katrina Kaif", " Fitness Ambassador");

		bio.add(details1);
		bio.add(details2);
		bio.add(details3);
		printAll(bio);
	}


	private static void printAll(Set<Map<String, String>> bio) {
		for (Map<String, String> info : bio) {
			// System.out.println(info);
			for (Map.Entry<String, String> data : info.entrySet()) {
				System.out.println(data.getKey() + " --  " + data.getValue());
			}
		}

	}

}
