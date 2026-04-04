package basic;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class UsingSet {
	
	public static void main(String[] args) {
		
		Set<String> actors=new HashSet<String>();
		actors.add("Rajesh");
		actors.add("Akshay");
		actors.add("Amitabh");
		actors.add("Rajani");
		actors.add("Tushar");
		
		actors.forEach(new Consumer<String>() {
			public void accept(String t) {
				System.out.print(t+"  ");
			};
		});
		
		System.out.println();
		
		Consumer<String> printName=(n) -> System.out.print(n+"  ");
		
		System.out.println();
		
		actors.forEach(printName);  // forEach is a Higher Order Function
		System.out.println();
		// Without Type
		actors.forEach((n) -> System.out.print(n.toUpperCase()+"  "));
		
		System.out.println();
		actors.forEach(n -> System.out.print(n.toUpperCase()+"  "));
		
		
		System.out.println();
		// Method Reference 
		actors.forEach(System.out::print);
		
		
		

		
		System.out.println();
		
		
		
	}

}
