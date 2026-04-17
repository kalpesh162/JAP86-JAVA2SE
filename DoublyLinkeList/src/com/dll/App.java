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

		linkedList.deleteFirst();
		System.out.println("---------------After deleteFirst----------------");
		linkedList.displayList();

		linkedList.deleteLast();

		System.out.println("---------------After deleteLast----------------");
		linkedList.displayList();
		linkedList.addAtPos(3, 40);
		linkedList.displayList();

		System.out.println("Invalid Pos");

		linkedList.addAtPos(30, 400);
		linkedList.addAtPos(-3, 400);

		linkedList.displayList();
		System.out.println("++++++++++++++++++++++");

		linkedList.deleteAtPos(3);
		linkedList.displayList();
		System.out.println("(((((())))))))");

		linkedList.reverseDisplay();

	}

}
