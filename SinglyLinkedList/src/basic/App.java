package basic;

public class App {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList(); // head=null

		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);

		list.display();
		System.out.println("++++++++");
		list.reverseDisplay(list.getHead());
	}

}
