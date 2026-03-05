class One extends Thread{
	@Override
	public void run(){
			for(int i=1;i<=5;i++){
	 		System.out.println(Thread.currentThread().getName()+" "+  5*i);
	 	}
	}
}

class Two extends Thread{
	@Override
	public void run(){
			for(int i=1;i<=5;i++){
	 		System.out.println(Thread.currentThread().getName()+" "+  11*i);
	 	}
	}
}

class Three extends Thread{
	@Override
	public void run(){
			for(int i=1;i<=5;i++){
	 		System.out.println(Thread.currentThread().getName()+" "+  13*i);
	 	}

	}
}

// I want three threds run seqentially
// public void join() throw InterruptedException


public class Sample4{
	public static void main(String[] args) {
			One one=new One(); 
			Two two=new Two();
			Three three=new Three();
			one.setName("ONE");
			two.setName("TWO");
			three.setName("THREE");

			one.start();   // 5 table
			// join after my execution
			// join after termination
			try {one.join();}catch(InterruptedException e) {}
			two.start();   // 11 table
			try {two.join();}catch(InterruptedException e) {}
			three.start(); // 13 table
			try {three.join();}catch(InterruptedException e) {}

			for(int i=1;i<=5;i++){
	 		System.out.println(Thread.currentThread().getName()+" "+  17*i);
	 	}
		
	}

}

//  t1 t2 t3 ate the three threads how we can run them sequentially ? 
