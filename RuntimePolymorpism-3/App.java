import java.util.Random;
class Shape{
	 void draw(){
	 	System.out.println("Shape Draw  ");
	 }
	 void erase(){
	 	System.out.println("Shape Erase  ");
	 }
}

class Circle extends Shape{
 	
 	void draw(){
	 	System.out.println("Circle Draw  ");
	 }
	 void erase(){
	 	System.out.println("Circle Erase  ");
	 }
}

class Square extends Shape{

	 void draw(){
	 	System.out.println("Square Draw  ");
	 }
	 void erase(){
	 	System.out.println("Square Erase  ");
	 }
}

class Triangle extends Shape{
	void draw(){
	 	System.out.println("Triangle Draw  ");
	 }
	 void erase(){
	 	System.out.println("Triangle Erase  ");
	 }
}

class Pentagaon extends Shape{

}

// class 

class RandomShapeGenerator{
		Random random=new Random();
		 public Shape next(){
		 	Shape sh=null;
	 		switch (random.nextInt(3)) {
	 			//System.out.println(""+random.nextInt(3));
	 			case 0 :  sh=new Circle(); break;
	 			case 1 :  sh=new Triangle(); break;
	 			case 2:   sh=new Square(); break;
	 		}
	 		return sh;
	 }
}

class App{

	static void drawShape(Shape shape){
			shape.draw();
			shape.erase();
	}

	static void createShape(Shape arr[]){
		  for(Shape shape : arr)
		  	drawShape(shape);
		  // shape=new Circle()
		  // shape=new Triangle()
		  // shape=new Square();
	}
	
	public static void main(String[] args) {

		// Array of Shape
		//            UPCASTING      UPCASTING     UPCASTING
		//Shape arr[]={new Circle(),new Triangle(),new Square()};
		//Shape arr[]={new Circle(),new Triangle(),new Square(), new Pentagaon};
		RandomShapeGenerator generator=new RandomShapeGenerator();

		Shape arr[]={generator.next(),generator.next(),generator.next()};	

		createShape(arr);

		System.out.println("(((((_____))))))");
	}
}

// 