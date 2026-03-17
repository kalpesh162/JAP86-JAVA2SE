package p1;

import java.util.Stack;

public class App {
	
	public static void main(String[] args) {
		
		Stack<String>stack=new Stack<String>();
		System.out.println(stack.isEmpty());  // true
		//stack.add("Hi");
		System.out.println(stack.push("One"));
		System.out.println(stack.push("TWO"));
		System.out.println(stack.push("THREE"));
		System.out.println(stack.push("FOUR"));
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		// iterator()  ListeIterator() elements()
		
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.search("TWO"));
		System.out.println(stack.search("One"));
		
		System.out.println(stack.search("FOUR"));
		
		System.out.println(stack.size());
		
		System.out.println(stack.isEmpty());
	}

}
