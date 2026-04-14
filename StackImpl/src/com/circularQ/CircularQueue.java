package com.circularQ;

public class CircularQueue {
	private int arr[];
	private int front;
	private int rear;

	public CircularQueue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return (rear + 1) % arr.length == front;
	}

	public void enqueue(int data) {

		if (isFull()) {
			System.out.println("Queue is FULL  ");
			return;
		}

		if ((front == -1))
			front = 0;

		rear = (rear + 1) % arr.length;
		arr[rear] = data;

	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is EMPTY");
			return -1;
		}

		int val = arr[front];
		
		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front = (front + 1) % arr.length;
		}

		return val;
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("Queue is EMPTY");
			return -1;
		}

		int val = arr[front];
		return val;

	}

}
