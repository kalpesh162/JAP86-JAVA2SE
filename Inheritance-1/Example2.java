
class Art{

 // Instance Block
	{
		System.out.println("Art Instace Block");
	}

	public Art(){
		super();
		System.out.println("Art Constructor");
	}
}

class Drawing extends Art{

	public Drawing(){
		super();
		System.out.println("Drawing Constructor");	
	}

// Instance Block
	{
		System.out.println("Drawing Instace Block");
	}
}

class Cartoon extends Drawing{

	 public Cartoon(){
	 	super();
	 	System.out.println("Cartoon Constructor");		
	 }

// Instance Block
	{
		System.out.println("Cartoon Instace Block");
	}
}

class Example2{
	public static void main(String[] args) {
		Cartoon tomAndJerry=new Cartoon();
	}
}

