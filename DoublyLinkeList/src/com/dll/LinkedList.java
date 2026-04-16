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

}
