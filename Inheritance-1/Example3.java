
class Art{
	static{
		System.out.println("Static Art");
	}

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
	static{
		System.out.println("Static Drawing");
	}


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

	static{
		System.out.println("Static Cartoon");
	}


	 public Cartoon(){
	 	super();
	 	System.out.println("Cartoon Constructor");		
	 }

// Instance Block
	{
		System.out.println("Cartoon Instace Block");
	}
}

class Example3{
	public static void main(String[] args) {
		Cartoon tomAndJerry=new Cartoon();
	}
}

/*
Static Art
Static Drawing
Static Cartoon
Art Instace Block
Art Constructor
Drawing Instace Block
Drawing Constructor
Cartoon Instace Block
Cartoon Constructor
*/