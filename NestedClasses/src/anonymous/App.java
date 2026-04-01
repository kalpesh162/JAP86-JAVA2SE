package anonymous;

abstract class Instrument {
	abstract void play();
}

class Guitar extends Instrument {

	@Override
	void play() {
		System.out.println("Guitar Plays");

	}

}

public class App {

	public static void main(String[] args) {
       Instrument i1=new Guitar();
       Guitar g1=new Guitar();
	}

}
