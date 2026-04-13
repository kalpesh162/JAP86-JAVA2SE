package com.basic;

public class App {
     public static void main(String[] args) {
		Stack st=new Stack(5);
		st.push(11);
		st.push(22);
		st.push(33);
		st.push(44);
		st.push(55);
		
		System.out.println("Top MOST ELEMENT   "+st.peek());
		
		st.display();
		System.out.println("******");
		System.out.println(st);
		
		System.out.println("Search  index "+st.search(33));
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("isEmpty "+st.isEmpty());
		System.out.println("Search  index "+st.search(33));
		
	}
}
