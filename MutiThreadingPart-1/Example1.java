class MyThread extends Thread{
	@Override
	public void run(){
		  // what yout task ?
		for(int i=1;i<=10;i++)
			System.out.println(5*i +" "+ Thread.currentThread().getName());
	}
}


class Example1{
	
// main --> task  subtask   --> main thread
	// Each Thread has its own Stack
	// Thread runs independsntly

	public static void main(String[] args) {
			// main Thread
		// main Thread create new Thread
			MyThread t1=new MyThread();
			//t1.run();  // No nw Thread Created
			t1.start();  // start() method internally create new Thread as
			// well it created new Stack for this thread

			System.out.println("===========================");
			  // what yout task ?
		for(int i=1;i<=10;i++)
			System.out.println(5*i +" "+ Thread.currentThread().getName());

	}
}