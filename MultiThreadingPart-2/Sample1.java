
class A extends Thread{
	 @Override
	 public void run(){
	 	for(int i=1;i<=5;i++){
	 		System.out.println(5*i);
	 	}
	 }
}


class B extends Thread{
	 @Override
	 public void run(){
	 	for(int i=1;i<=5;i++){
	 		System.out.println(11*i);
	 	}
	 }
}

// How many Threads are running activeCount()  --> no of threads
class Sample1{
	// JVM --> main Thread --> main()
	// Parent Thread
	public static void main(String[] args) {
		
		A a1=new A();
		B b1=new B();
		a1.setName("A");
		b1.setName("B");

		a1.start(); 
		b1.start();
		System.out.println("Count Thread "+Thread.activeCount());

		for(int i=1;i<=10;i++){
			 try{Thread.sleep(100);}catch(InterruptedException e){ }
			System.out.print(i+" ");
		}


			System.out.println("Count Thread "+Thread.activeCount());

			// Can we start thread again()  or twice
			// What happen if we do ?

			// java.lang.IllegalThreadStateException
			a1.start();  
			b1.start();
	}
}