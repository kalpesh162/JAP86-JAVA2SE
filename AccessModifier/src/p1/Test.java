package p1;

public class Test{

	public static void main(String[] args) {
		
		B b1=new B();
		//System.out.println("private field  "+b1.pri);  // cant be access
		//b1.privateFunction();// cant be access
		System.out.println("default field  "+b1.def);
		b1.defaultFunction();
		System.out.println("protected field  "+b1.proc);
		b1.protectedFunction();
		System.out.println("public field  "+b1.pub);
		b1.publicFunction();

		System.out.println("-0-----------------------");
		C c1=new C();
		c1.f1();


	}

}