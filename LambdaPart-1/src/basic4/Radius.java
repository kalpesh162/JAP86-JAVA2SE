package basic4;
//Supply a fixed circle area (radius = 5).

import java.util.function.Supplier;

// public java.util.function.Supplier<T> {   T get(); }
public class Radius {
	
	public static void main(String[] args) {
		
		Supplier<Integer> getRadius=() ->  { return 5; };
		
		Supplier<Integer> showRadius=() -> 5;
		
		System.out.println(showRadius.get());
		System.out.println(getRadius.get());
		
	}
}
