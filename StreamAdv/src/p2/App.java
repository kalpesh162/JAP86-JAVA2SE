package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// From a list of names → select names starting with "N"
public class App {

	public static void main(String[] args) {

		List<String> friends = Arrays.asList("Ram", "Nitin", "Neha", "Amit");

		List<String> result = new ArrayList<String>();

		for (String name : friends) {
				if(name.startsWith("N"))
					result.add(name);
		}
		System.out.println(result);
		
		//Predicate<String>checkWithN=(String s) ->  s.startsWith("N");
		Predicate<String>checkWithN=s ->  s.startsWith("N");
		
		friends.stream()
			   .filter(checkWithN)
			   .forEach(System.out::println);
			   
		long countWithN=friends.stream()
		       .filter(name -> name.startsWith("N"))
		       .count();
		System.out.println(countWithN);
		
		
		System.out.println("-----------------");
		
		Predicate<String>checkWithA=s ->  s.startsWith("A");
		
		long countWithA=friends.stream()
							   .filter(checkWithA)
							   .count();
		Predicate<String>checkWithR=s ->  s.startsWith("R");
		
		long coutWithR=friends.stream()
				              .filter(checkWithR)
				              .count();
		
	}

}
