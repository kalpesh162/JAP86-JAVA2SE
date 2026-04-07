package p2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amit", "Neha", "Raj", "Amit", "John", "Neha", "Sam");
		
		names.forEach(System.out::print);
		System.out.println();
		names.stream().forEach(System.out::println);
		
		Set<String> set=names.stream()
		     .collect(Collectors.toSet());
		
		System.out.println(set);
		
		List<Integer>numbers=Arrays.asList(1,2,3,4, 5, 6, 7, 8, 9, 10);

		// IMP
		int sum = numbers.stream()
				         .reduce(0, (a, b) -> a + b);

		System.out.println(sum);
		
		long size=names.stream()
		     .count();
		
		System.out.println("Size "+size);
		
		System.out.println("--------");
		// IMP --> Spring Boot
		Optional<String> op=names.stream()
		     .findFirst();

		System.out.println(op);
		System.out.println(op.get());
		
		if(op.isPresent()) {
			System.out.println(op.get());
		}
		
		Optional<String> op1=names.stream()
			     .findAny();
		System.out.println("-------------");
		if(op1.isPresent()) {
			System.out.println(op1.get());
		}
		
		System.out.println("==========================");
		Object arr[]=names.stream()
		     .toArray();
		
		System.out.println("+++++++++++++++++++++");
		
		numbers.stream()
		       .max(Integer::compareTo);
		
				
		//Comparator<Integer> byNum=(i1,i2) -> i1.compareTo(i2);       
		Optional<Integer> maxValue=numbers.stream()
			   .max((i1,i2) -> i1.compareTo(i2));
		System.out.println(maxValue.get());

	}

}
