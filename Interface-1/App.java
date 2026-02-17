interface Instrument{
	int x=5; // public static final
	void play();  // public abstract
}
// If we dont want to override play method in Guitar then we need to make 
// Guitar type as abstract

class Guitar implements Instrument{
	// instance fields
	// static fields
	@Override
	public void play(){
		System.out.println("Guitar Plays");
	}

	// instance method
	// static method
}


class Violin implements Instrument{
	// instance fields
	// static fields
	@Override
	public void play(){
		System.out.println("Violin Plays");
	}

	// instance method
	// static method
}


class Flute implements Instrument{
	// instance fields
	// static fields
	@Override
	public void play(){
		System.out.println("Flute Plays");
	}

	// instance method
	// static method
}

class App{
	// Instrument i=new Guitar();
	static void tune(Instrument i){
			i.play();
	}

	public static void main(String[] args) {
					// we cant create an Object of interface
			tune(new Guitar());
			tune(new Violin());
			tune(new Flute());

			System.out.println(Instrument.x);
			System.out.println(Guitar.x);
	}
}

// Note
// Qustion Whats diff between final and const
//const int x=11; // illegal start of expression
	