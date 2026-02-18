interface Machine{
	 void on();
	 void off();
}

interface Brand{
	 String getName();
}

interface MusicMachine extends Machine,Brand{
	void rewind();
	void pause();
	void forward();
}

class Radio implements MusicMachine{
	// Override
}

class Walkman implements MusicMachine{
	// Override
}

class GramoPhome implements MusicMachine{
// Override
}


class Motor implements Machine{
	// on
	// off
}


class Demo{

	static void startTheParty(MusicMachine machine){
		machine.on();
	}

	static void start(Machine m){
		m.on();
	}

	public static void main(String[] args) {
		

		startTheParty(new Walkman());
	}
}