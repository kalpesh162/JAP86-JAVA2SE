
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

class Example14{
	
	static {
		System.out.println("Example4 static Block");
	}

	public static void main(String[] args) {
		// Cartoon tomAndJerry=new Cartoon();

		Drawing d1=new Drawing();

	}
}
