
class A extends Thread{
	 @Override
	 public void run(){
	 	for(int i=1;i<=5;i++){
	 		System.out.println(Thread.currentThread().getName()+" "+  5*i);
	 	}
	 }
}


class B extends Thread{
	 @Override
	 public void run(){
	 	for(int i=1;i<=5;i++){
	 		System.out.println(Thread.currentThread().getName()+" "+  11*i);
	 	}
	 }
}

// Thread has a Priority
// Range 1 TO 10


class Sample3{
	// JVM --> main Thread --> main()
	// Parent Thread
	public static void main(String[] args) {
		
		System.out.println("NORM_PRIORITY  "+Thread.NORM_PRIORITY);
		System.out.println("MAX_PRIORITY  "+Thread.MAX_PRIORITY);
		System.out.println("MIN_PRIORITY  "+Thread.MIN_PRIORITY);
		System.out.println(Thread.currentThread()); // Thread[main,5,main]
		System.out.println(Thread.currentThread().getPriority()); 
		// main Thread  ny JAVA (JVM)
		System.out.println("-----------------------");
		A a1=new A();   
		B b1=new B();
		a1.setName("A");
		b1.setName("B");
		a1.setPriority(1);
		b1.setPriority(10);
		a1.start(); 
		b1.start();
		
		for(int i=1;i<=10;i++){
			System.out.println(i+" ");
		}

	}
}


// JVM Schedular  --> You cant rely on Priorities
// setPriority  --> Chance increase B thread runs first not gurantee

// JVM  --> Based ON Priorities 

/*
@FunctionalInterface
interface java.lang.Runnable{
	 void run();
}



public class java.lang.Thread extends Object implements Runnable{
		public static final NORM_PRIORITY=5;
		public static final MIN_PRIORITY=1;
		public static final MAX_PRIORITY=10;
		public int getPriority(){}
		public void  setPriority(int p){}

}


public void  setPriority(int p){
		if(p>=1 && p<=10) { }
	    else
	         throw new IllegalArgumentException();	
	

}
*/