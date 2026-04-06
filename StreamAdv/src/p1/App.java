package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		List<String> friends = Arrays.asList("ram", "shyam", "ravi");
		List<String> result = new ArrayList<String>();

		for (String name : friends) {
			result.add(name.toUpperCase());
		}
		System.out.println(friends);
		System.out.println(result);

		// Stream<T> map(Function<T,R>)

		Stream<String> stream = friends.stream();
		// Stream<String>stream=friends.parallelStream();

		// Function<String, String>transform=(String s) -> { return s.toUpperCase();};
		Function<String, String> transform = s -> s.toUpperCase();

		// stream.map(transform);
		// stream.map((s) -> s.toUpperCase());
		Stream<String> str1 = stream.map(String::toUpperCase);

		// str1.forEach(name -> System.out.println(name));
		str1.forEach(System.out::println);
		// forEach Terminal

		System.out.println("----------------");

		friends.stream()
		       .map((name) -> name.toUpperCase())
		       .forEach(n1 -> System.out.println(n1));
		
		System.out.println("----------------");

		friends.stream()
			   .map(String::toUpperCase)
			   .forEach(System.out::println);

		System.out.println("-------------------");

		friends.stream()
			   .map((name) -> name.length())
			   .forEach(System.out::println);

		System.out.println("-------------------");

		friends.stream()
			   .map(String::length)
			   .forEach(System.out::println);
		
		System.out.println("Collecting result");
		
		List<String>finalResult=friends.stream()
			   .map(String::toUpperCase)
			   .collect(Collectors.toList());
		
		// collect(Collector)   Terminal Operation
		//  map  Intermediate Operation
		
		System.out.println(finalResult);
		
		

	}

}
