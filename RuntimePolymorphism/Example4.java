
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

class Tabla extends Instrument{
	 void play(){
			System.out.println("Tabla is playing ..");	
		}
}
class Example4{
/*
 // If we try to add new Type then existion design has to be changed

	static void tune(Guitar g1){
		g1.play();
	}

	static void tune(Flute f1){
		f1.play();
	}

	static void tune(Violin v1){
		v1.play();
	}

	static void tune(Instrument i1){
		i1.play();
	}
*/
   // Instrument i1=g1   // UPACSTING

	static void tune(Instrument i1){
		i1.play();
	}

	public static void main(String[] args) {
		Guitar g1=new Guitar();
		Violin v1=new Violin();
		Flute f1=new Flute();
		Instrument i1=new Instrument();

		tune(g1);
		tune(v1);
		tune(f1);
		tune(i1);

		Tabla t1=new Tabla();
		tune(t1);


	}
}