package com.queue;

public class App {
	
	public static void main(String[] args) {
		
		Queue queue=new Queue(5);
		queue.enqueue(11);
		queue.enqueue(22);
		queue.enqueue(33);
		queue.enqueue(44);
		queue.enqueue(55);
		
		queue.display();
		
		// Loop
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		
		// Use Case Menu
		
	}

}
