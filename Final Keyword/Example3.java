class Point{
	
	 int x; 
	 int y;
	 Point(int x,int y){
	 	this.x=x;
	 	this.y=y;
	 }
}

class Example2{

	public static void main(String[] args) {

		final Point p1=new Point(11,22);
		// change x & y
		System.out.println(p1.x +" "+p1.y);	
	
		 Point p2=new Point(10,20);	
		// error: cannot assign a value to final variable p1
		//p1=p2;
		
	}
}