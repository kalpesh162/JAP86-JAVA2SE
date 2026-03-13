package p2;
import java.util.ArrayList;
import java.util.Iterator;
// What is Fail Fast Iterator ?
public class App {
	public static void main(String[] args) {
		ArrayList<String>actress=new ArrayList<String>();
		actress.add("Madhuri");
		actress.add("Kareena");
		actress.add("Janvi");
		actress.add("Sonam");
		actress.add("Simran");
		// actress.remove("Kareena");
		// actress.remove(1);
		System.out.println(actress);
		String input="Kareena";
		Iterator<String>itr=actress.iterator();
		
		while(itr.hasNext()) {
			 String str=itr.next();
			 if(str.equals(input))
				 actress.remove(str);  //java.util.ConcurrentModificationException    itr.remove() 
		}
		
		System.out.println(actress);
	}
	
	// While Iterating Collection if you wan to remove an Object From Collection
	// Here You Use acress.remove(object)
	// Thats leads to java.util.ConcurrentModificationException
	
	// Avoid this exception you shopu delete Object by itertor method 
	
}
