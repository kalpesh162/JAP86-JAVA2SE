// Why we need to Override to String
class Point{
	 int x; int y;
	 Point(int x,int y){ this.x=x;this.y=y;}
	 // Setter
	 // getter

	 @Override
	 public String toString(){
	 	return "x "+x+"  Y "+y;
	 }
}

class App{
	public static void main(String[] args) {
		Point p1=new Point(11,22);
		// p1.getX()
		// p1.getY()
		// p1.x
		// p1.y
		System.out.println(p1);  // println(Object)
	}
}