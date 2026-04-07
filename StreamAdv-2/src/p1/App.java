package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		// Stream are Lazy
		List<String> names = Arrays.asList("Amit", "Neha", "Raj", "Amit", "John", "Neha", "Sam");
		
		names.stream()
			 .filter((name) -> name.startsWith("A"))
			 .forEach(System.out::println);
		
		System.out.println("------------------------------");

		
		names.stream()
		     .map(name -> name.toUpperCase())
		     .forEach(System.out::println);
		
		System.out.println("-------------------------------");
		

		List<List<String>> list = Arrays.asList(
		    Arrays.asList("A", "B"),
		    Arrays.asList("C", "D")
		);

        // V IMP	
		List<String> result=list.stream()
		    .flatMap(innerList -> innerList.stream())
		    .collect(Collectors.toList());
		
		System.out.println(result);
		
		System.out.println("--------------------");
		
		names.stream()
		     .distinct()
		     .forEach(System.out::println);
		
		System.out.println("+++++++++++++++++++++++");
		
		names.stream()
			 .sorted()
			 .forEach(System.out::println);
		

		System.out.println("+++++++++++++++++++++++");
		
		names.stream()
		 .sorted( (a,b) ->  b.compareTo(a))
		 .forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		names.stream()
		     .limit(3)
		     .forEach(System.out::println);
		
		System.out.println("****************************");
		
		names.stream()
		     .skip(3)
		     .forEach(System.out::println);
		
		System.out.println("--------------------");
		
		names.stream()
		     .skip(2)
		     .limit(3)
		     .forEach(System.out::println);

		
		
		
		
		
	
		
		
		
	}

}
