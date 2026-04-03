package basic4;
//Return the last digit of a number.   input <-> output

/*
public interface java.util.function.Function<T,R>{
	   public R apply(T t);
}
*/

import java.util.function.Function;

public class LastDigit {

	public static void main(String[] args) {

		int num = 1234;

		Function<Integer, Integer> getLastDigit = (i) -> {
			return i % 10;
		};
		Function<Integer, Integer> getLastDigit1 = i -> i % 10;

		System.out.println(getLastDigit.apply(num));
		System.out.println(getLastDigit1.apply(num));
		
	}

}
