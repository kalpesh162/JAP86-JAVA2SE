class Data{
	  int x=11;  // instance Field
	  static int y=22;  // static field

// instance Function can access both instance fields and static fields
	  void show(){  // Instance Function 
	  	System.out.println("X  "+x);
	  	System.out.println("Y  "+y);
	  }

	  static void display(){
	  	// non-static variable x cannot be referenced from a static context
	  	//System.out.println("X  "+x);
	  	System.out.println("Y  "+y);  	
	  }
}

class App{

public static void main(String[] args) {
		
		Data d1=new Data();

		d1.show();  // d1.show() --> d1.show(this)
		//d1.show(this)
		/*
          System.out.print(this.x)
          System.out.print(this.y)  
          System.out.print(Data.y)  

		*/

		d1.display();
		// d1.display()  --> static
		// d1.display(this)
		Data.display();
	}
}