class MyRunnable implements Runnable{
	@Override
	public void run(){
		  // what yout task ?
		for(int i=1;i<=10;i++)
			System.out.println(5*i +" "+ Thread.currentThread().getName());
	}
}


class Example2{
	
// main --> task  subtask   --> main thread
	// Each Thread has its own Stack
	// Thread runs independsntly
  // Thread()
	// Thread(Runnable )
	public static void main(String[] args) {
			// main Thread
		// main Thread create new Thread
			MyRunnable work=new MyRunnable();
			
			Thread t1=new Thread(work);

			t1.start();  // start() method internally create new Thread as
			// well it created new Stack for this thread

			System.out.println("===========================");
			  // what yout task ?
		for(int i=1;i<=10;i++)
			System.out.println(5*i +" "+ Thread.currentThread().getName());

	}
}