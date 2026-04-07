package p3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {

	public static Predicate<String> checkIfStartsWith(final String letter) {
		//Predicate<String> check=name -> name.startsWith(letter);
		//return check;
		return name -> name.startsWith(letter);
		
	}
	
	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Ram", "Nitin", "Neha", "Amit");

		List<String> childhoodFriends = Arrays.asList("Ravi", "Suresh", "Meena", "Kiran");

		List<String> collegeFriends = Arrays.asList("Arjun", "Priya", "Kunal", "Sneha");

		String letter="N";
		long countWithN=friends.stream()
		       .filter(checkIfStartsWith(letter))
		       .count();

		System.out.println(countWithN);
	}

}
