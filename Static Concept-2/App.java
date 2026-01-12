// Design Pattern  --> Singletion Design Pattern
//  To Implement Singletion Design Pattern
class A{
	// Fields
   static A a1;
	// Function
	private A(){}

	// Instance Method
	static A getInstanceA(){
		// A a1=new A();
		if(a1==null)
			a1=new A();
		 return a1;
	}
}

class App{
	public static void main(String[] args) {
		//A a1=new A();	
			A a1=A.getInstanceA();
			A a2=A.getInstanceA();
			A a3=A.getInstanceA();
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);

	}
}