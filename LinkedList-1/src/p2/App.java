package p2;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		
		LinkedList<String>movies=new LinkedList<String>();
		movies.offer("Sholey");
		movies.offer("Hum Tum");
		movies.offer("Tiranga");
		
		movies.offerFirst("Dhurandhar");
		movies.offerLast("Rocky");
		
		System.out.println(movies);
		
		// remove(E e)
		// remove(pos)
		// iterator void remove()
		// removeFirst()
		// removeLast()
		
		// -----------------------------------
		
		// pollFirst()
		// pollLast()
		
		// Dont want to remove an element  peek()  
		// Only able to see the elment first or last
		
		System.out.println(movies.peek());
		System.out.println(movies.peekLast());
		System.out.println(movies.peekFirst()); 
		
		System.out.println(movies.poll());
		
		System.out.println(movies);
		
		movies.push("RRR");  // push   addFirst  add(0,E )  /offerFirst
		
		System.out.println(movies);
		
	}
}
