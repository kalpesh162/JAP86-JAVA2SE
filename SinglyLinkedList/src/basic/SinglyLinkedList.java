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

}
