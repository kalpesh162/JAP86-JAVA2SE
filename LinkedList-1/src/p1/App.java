package p1;

import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		
		LinkedList<Integer> numbers=new LinkedList<Integer>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(55);
		numbers.add(77);
		
		System.out.println(numbers);
		
		numbers.addFirst(111);  //numbers.add(0,111);
		
		System.out.println(numbers);
		numbers.addLast(999); 
		System.out.println(numbers);
		
		numbers.add(3, 66);
		System.out.println(numbers);
		
		// getFirst()
		// getLast()
		
		//boolean	offer(E e)	
		
		//boolean	offerFirst(E e)	
		
		//boolean	offerLast(E e)
		
		
	}

}
