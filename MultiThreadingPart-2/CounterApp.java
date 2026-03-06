class Counter {
	int cnt = 0; // data

	public synchronized  void increment() { // method
		cnt++; 

		// Read Value
		// Incremt
		// Assign

	}
}
class Thread1 extends Thread {
	Counter counter;
	public Thread1(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++)
			counter.increment();
	}
}

class Thread2 extends Thread {
	Counter counter;

	public Thread2(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++)
			counter.increment();
	}
}

public class CounterApp {

	public static void main(String[] args) throws InterruptedException {

			Counter counter=new Counter();
			Thread1 t1=new Thread1(counter);
			Thread2 t2=new Thread2(counter);
			
			t1.start();
			t2.start();
		
			Thread.sleep(3);
			
			System.out.println("--> "+counter.cnt);
	}

}






