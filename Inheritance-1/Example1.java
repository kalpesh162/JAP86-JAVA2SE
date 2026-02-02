 /* 
 // Order Of Constructor
public classjava.lang.Object{  // COSMIC | ROOT
	  Object(){ }
	  // ....
}
*/
class Art{

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
}

class Cartoon extends Drawing{

	 public Cartoon(){
	 	super();
	 	System.out.println("Cartoon Constructor");		
	 }
}

class Example1{
	public static void main(String[] args) {
		Cartoon tomAndJerry=new Cartoon();
	}
}

/*
Art Constructor
Drawing Constructor
Cartoon Constructor
*/