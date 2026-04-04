package basic4;
//Check if a year is a leap year.

/*
public interface java.util.function.Predicate<T>{
	   
	  boolean test(T t);
	
}
*/

import java.util.function.Predicate;

public class LeapYear {

	public static void main(String[] args) {

		Predicate<Integer> isALeapYear = (Integer i) -> (i % 400 == 0 || i % 100 != 0 && i % 4 == 0) ? true : false;

		Predicate<Integer> isALeapYear1 = i -> (i % 400 == 0 || i % 100 != 0 && i % 4 == 0) ? true : false;

		System.out.println(isALeapYear.test(200));
		System.out.println(isALeapYear.test(1992));

		
	}

}
