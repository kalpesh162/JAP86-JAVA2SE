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

class Example1{
	public static void main(String[] args) {
		Guitar g1=new Guitar();
		g1.play();		
	}
}