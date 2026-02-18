// If class has incomplete (abstract) method then we must be declare as class abstract
abstract class Instrument{
	// if logically method is incomplete the will declare as abstract method
	// abstract method doesnt have body(define )
	abstract void play();
	//methods
}
// Not necessary  if class is abstract then there is no need that every method should be abstract
/*
abstract class Instrument{
	void f1(){ }
}
*/
/*
abstract class Guitar extends Instrument{
}
*/
 class Guitar extends Instrument{
 	// 
 	@Override
 	void play(){
 		System.out.println("Guitar Plays");
 	}

}

 class Violin extends Instrument{
 	@Override
 	void play(){
 		System.out.println("Violin Plays");
 	}

}

 class Flute extends Instrument{
 	@Override
 	void play(){
 		System.out.println("Flute Plays");
 	}

}
class App{

	// Instrument i=new Guitar();
	// Instrument i=new Violin();
	// Instrument i=new Flute();
	static void tune(Instrument i){
		i.play();
	}

	public static void main(String[] args) {
		// Instrument is abstract; cannot be instantiated
		//Instrument i1=new Instrument();
		//i1.play();

		Guitar g1=new Guitar();
		g1.play();
		Instrument i1=new Guitar();
		i1.play();	
		tune(new Guitar());
		tune(new Violin());
		tune(new Flute());
	}
}

// abstarc class   --> class Object cant be created

// Why We create Abstract class

// We create abstract class to manipulate set of subclasses
 //through common Point (class refereence)

// Guitar Flute Violin ---> Instrument refereence (By Playing ....)