class Ram extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName()+" "+(5*i));
	}

}
class Shyam extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName()+" "+(11*i));
	}
}
// JVM --> main Thread -->main()
class Example1{
	public static void main(String[] args) {
		Ram r1=new Ram();   // NEW
		Shyam s1=new Shyam();   // NEW
		r1.setName("Ram");
		s1.setName("Shyam");

		r1.start();  // RUNNABEL  --> run() Ram
		s1.start();  // RUNNABEL  --> run() Shyam

		System.out.println("Actice Count "+Thread.activeCount());

		for(int i=1;i<=5;i++){
			try {Thread.sleep(1);} catch(InterruptedException e){ }
			System.out.println(Thread.currentThread().getName()+" "+(13*i));
		}
		
		System.out.println("Actice Count "+Thread.activeCount());		
	}
}