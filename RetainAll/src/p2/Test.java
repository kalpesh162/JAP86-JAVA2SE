package p2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> actress = new ArrayList<String>();
		actress.add("Madhuri");
		actress.add("Kareena");
		actress.add("Janvi");
		actress.add("Sonam");
		actress.add("Simran");
		System.out.println(actress);

		String input = "Kareena";
		Iterator<String> itr = actress.iterator();

		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equals(input))
				// actress.remove(str); // actress --> ArrayList
				itr.remove();

			
		}
		System.out.println(actress);
	}

}
