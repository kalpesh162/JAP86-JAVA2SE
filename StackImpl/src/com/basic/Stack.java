package com.basic;

public class Stack {
	private int top;
	private int arr[]; // 

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	public void push(int ele) {
		// Checking Boundary Condition
		if (isFull()) {
			System.out.println("Stack is FULL");
			return;
		}

		// Adding Element
		top = top + 1;
		arr[top] = ele;

	}

	public int pop() {
		// Here -1 indicates stack is empty
		if (isEmpty()) {
			System.out.println("Stack is Empty ");
			return -1;
		}

		int val = arr[top];
		top = top - 1;
		return val;
	}

	public int peek() {
		// Here -1 indicates stack is empty
		if (isEmpty()) {
			System.out.println("Stack is Empty ");
			return -1;
		}

		int val = arr[top];
		return val;
	}

	public int search(int ele) {
		for (int i = top; i >= 0; i--) {
			if (arr[i] == ele)
				return i;
		}
		return -1;// indicate ele not found in stack
	}

	// display

	public void display() {
		System.out.println("Stack Elements .....");
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder(arr.length);
		for (int i = top; i >= 0; i--)
			res.append(arr[i] + "  ");

		return res.toString();
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}

}
