package com.dll;

public class LinkedList {

	static class Node {
		private Node prev;
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = prev = null;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		size = 0;
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = head;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}

	public void displayList() {
		System.out.println("---------------");
		Node trav = head;
		System.out.println("***");
		while (trav != null) {

			System.out.print(trav.data + " ==> ");
			trav = trav.next;
		}
		System.out.println();

	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = head;
		} else {

			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;

		}
		size++;
	}

	public void deleteFirst() {
		if (head == null)
			return;
		else if (head == tail) {
			head = head.next;
		} else {
			head = head.next;
			head.prev = null;
		}
		size--;
	}

	public void deleteLast() {
		if (head == null)
			return;
		else if (head.next == null) {
			head = tail = null;
		} else {

			tail = tail.prev;
			tail.next = null;

		}
		size--;

	}

	public void addAtPos(int pos, int data) {

		if (pos < 1 || pos + 1 > size)
			return;
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
		} else if (pos == 1) {
			addFirst(data);
		} else if (pos == size + 1) {
			addLast(data);
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			newNode.prev = trav;
			trav.next.prev = newNode;
			trav.next = newNode;

		}
		size++;
	}

	public void deleteAtPos(int pos) {
		if (pos < 1 || pos + 1 > size)
			return;
		else if (head == null)
			return;
		else if (head == tail) {
			head = tail = null;
		} else if (pos == 1) {
			deleteFirst();
		} else if (pos == size + 1) {
			deleteLast();
		} else {
			Node trav = head;
			for (int i = 1; i < pos; i++)
				trav = trav.next;

			trav.next.prev = trav.prev;
			trav.prev.next = trav.next;
		}
		size--;
	}

	public void reverseDisplay() {
		Node trav = tail;
		while (trav != null) {
			System.out.println(" --> " + trav.data);
			trav = trav.prev;
		}
	}

}
