// Program --> Process 
// Process running instance of Program 
// Process has a life and process has a state
// Process at least Single Thread [sub task ]

class App{
	public static void main(String[] args) {
		// Thread[main,5,main]
		// main  ---> Thread name
		// 5     --> Thread Priority
		// main  --> Thread Group

		System.out.println(Thread.currentThread());

		for(int i=1;i<=10;i++){
			System.out.println(10*i+" "+Thread.currentThread());
		}

		// static Thread currentThread()
		// When we print an Object internally Object conversion String 
		//toString
		// public String toString(){
		// threadName + thread Priority + thread group name  }
		// String getName()

	}

	}
}

// javac App.java   --> App.class    --> java App --> JVM ---RUN

// class Thread {  public static Thread currentThread() }