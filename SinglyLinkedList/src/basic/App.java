package basic;

public class App {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList(); // head=null

		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);

		list.display();

		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
		list.display();

		list.deleteFirst();
		System.out.println("After Deleteing First");
		list.display();

		list.deleteLast();
		System.out.println("After Deleteing Last");
		list.display();

	}

}
