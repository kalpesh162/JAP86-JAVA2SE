package basic;

public class SinglyLinkedList {

	private Node head;

	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.setData(data);
			this.setNext(null);
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	public SinglyLinkedList() {
		setHead(null);
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;

			trav.next = newNode;
		}

	}

	public void display() {
		System.out.println("Linked List .......");
		Node trav = head;

		while (trav != null) {
			System.out.print(trav.data + " -->");
			trav = trav.next;
		}
		System.out.println();
		System.out.println("---------------------------");

	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		} else {
			head = head.next;
		}
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		else if(head.next==null) {
			head=head.next;
					
		}
		else {
			Node trav = head;
			Node trav_bk = null;

			while (trav.next != null) {
				trav_bk = trav;
				trav = trav.next;
			}
			trav_bk.next = null;

			trav = null;
		}

	}

}
