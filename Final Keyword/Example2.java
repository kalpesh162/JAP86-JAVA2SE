class Point{
	// final fiels as instance fields
	 final int x; 
	 final int y;
	 Point(int x,int y){
	 	this.x=x;
	 	this.y=y;
	 }
}

class Example2{

	public static void main(String[] args) {

		Point p1=new Point(11,22);
		// change x & y
		System.out.println(p1.x +" "+p1.y);	
	//	p1.x=10;
	//	p1.y=20;

		System.out.println(p1.x +" "+p1.y);
		
	}
}