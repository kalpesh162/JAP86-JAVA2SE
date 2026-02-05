
class Instrument{
	void play(){
		System.out.println("Instrument is playing...");
	}
}
// Guitar is an Instrument
// Guitar is Sub Class
// Instrument Super Class
class Guitar extends Instrument{

	void play(){
		System.out.println("Guitar is playing ..");	
	}
}
class Violin extends Instrument{

	void play(){
		System.out.println("Violin is playing ..");	
	}
}

class Flute extends Instrument{

	 void play(){
			System.out.println("Flute is playing ..");	
		}
}
class Example2{
	public static void main(String[] args) {
		Guitar g1=new Guitar();
		Violin v1=new Violin();
		Flute f1=new Flute();

		g1.play();		
		v1.play();
		f1.play();

		// What is Runtime Polymorphism?
		//Instrument i1=new Instrument();

		// Guitar is a type of Instrument
		// Instrument parent 
		// parent ref (Instrument i1) = Child class Object (new Guitar())
		// UPCASTING   --> Parent ref ponting child class Object

		Instrument i1=new Guitar();  // Object --> Guitar
		i1.play();
	}
}