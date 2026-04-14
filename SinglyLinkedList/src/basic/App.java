package basic;

import basic.SinglyLinkedList.Node;

public class App {
	
	public static void main(String[] args) {
		
		SinglyLinkedList list=new SinglyLinkedList();   // head=null
		
		Node newNode=new Node(10);   // [100]  | 10 | null|
		
		Node head=list.getHead();
		head=newNode;
		
		
	}

}
