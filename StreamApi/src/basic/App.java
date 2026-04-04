package basic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
public class App {
	public static void main(String[] args) {
		List<String> actors = Arrays.asList("Amir", "Abhishek", "Rajesh", "Kunal", "Ravi");
		// Traditional
		for (int i = 0; i < actors.size(); i++)
			System.out.println(actors.get(i));
		// foreach
		for (String name : actors)
			System.out.println(name);
		// ListItearator
		Iterator<String> itr = actors.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Using Consumer (Anonymous Class)
		// default void forEach(Consumer<? super T> action)
		actors.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		 // using Lambada
		Consumer<String> comsume = (name) -> System.out.println(name);
		actors.forEach(comsume);
        // invokedynamic		
		actors.forEach((String name) -> System.out.print(name+" "));
		// type inference
		actors.forEach(name -> System.out.print(name+" "));
		
		// (name) -> System.out.print(name+" ")
		// System.out::print   Method Refernece
		
		actors.forEach(System.out::print);
		
		
		
		

	}

}
