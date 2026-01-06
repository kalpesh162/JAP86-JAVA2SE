class Point{
	int x;
	int y;

	Point(){
		System.out.println("[ X "+x+"  Y "+y +" ]");
		x=1;
		y=1;
	}

	Point(int a,int b){
		x=a;
		y=b;
	}

	void displayCordinate(){
		System.out.println("X  "+x+ "  Y"+y);
	}

	int getX(){
		return x;
	}
	int getY(){
		return y;
	}

}
// Constructor
// What is Constructor
// Why We Need Constructor
// How To Use Constructor

// Without Constructor we can not create an Object


class App{

	public static void main(String[] args) {
		Point p1=new Point();
		p1.displayCordinate();

		//p1.x=11;
		//p1.y=11;

		Point p2=new Point(11,22);
		p2.displayCordinate();
		
		
	}

}
