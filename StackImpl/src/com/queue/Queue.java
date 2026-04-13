package com.queue;

public class Queue {
	private int front;
	private int rear;
	private int arr[];

	public Queue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	public boolean isFull() {
		return rear == arr.length - 1;
	}

	public void enqueue(int ele) {
		if (isFull()) {
			System.out.println("Queue is Full");
			return;
		}

		rear = rear + 1;
		arr[rear] = ele;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		front = front + 1;
		return arr[front];
	}

	public void display() {

		for (int i = front + 1; i <= rear; i++)
			System.out.println(arr[i]);
	}

}
