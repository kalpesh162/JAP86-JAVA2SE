package com.circularQ;

import java.util.zip.CRC32;

public class App {

	public static void main(String[] args) {

		CircularQueue circularQueue = new CircularQueue(5);

		System.out.println("is Empty  " + circularQueue.isEmpty());
		circularQueue.enqueue(11);
		circularQueue.enqueue(22);
		circularQueue.enqueue(33);
		circularQueue.enqueue(44);
		circularQueue.enqueue(55);
		circularQueue.enqueue(66);

		System.out.println(circularQueue.peek());
		System.out.println(" ==> " + circularQueue.dequeue());

		while (!circularQueue.isEmpty()) {
			System.out.println(" ==> " + circularQueue.dequeue());
		}

		circularQueue.enqueue(66);
	}

}
