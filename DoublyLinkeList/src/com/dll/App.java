package com.dll;

public class App {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(40);

		linkedList.displayList();
		
		linkedList.addLast(50);
		linkedList.addLast(60);
		linkedList.addLast(70);
		linkedList.addLast(80);
		System.out.println("-------------------------------");
		linkedList.displayList();

	}

}
