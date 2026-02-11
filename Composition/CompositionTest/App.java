class Engine{
	void start(){ }
	void stop(){ }
}

class Wheel{
	 void inflate(int psi){ }
}

class Door{
	  void open(){ }
	  void close(){ }
}

class Window{
	 void rollUp(){  System.out.println("rollUp....");}
	 void rollDown(){ }
}

class Car{
	 Engine engine=new Engine();
	 Door[] door=new Door[2];
	 Wheel [] wheels=new Wheel[4];
	  Window[] windows=new Window[2];
	Car(){

		door[0]=new Door();
		door[1]=new Door();
		Wheel one =new Wheel();
		Wheel two =new Wheel();
		Wheel three =new Wheel();
		Wheel four =new Wheel();
		wheels[0]=one;wheels[1]=two;wheels[2]=three;wheels[3]=four;
		Window right=new Window();
		Window left=new Window();
		windows[0]=right;
		windows[1]=left;
	}
}

class App{

	public static void main(String[] args) {
		Car car=new Car();		
		//car.windows[0].rollUp();
		car.windows[1].rollUp();

		int A[]={1,2,3,4};

//		Door []dd={new Door(), new Door()}
	}
}


