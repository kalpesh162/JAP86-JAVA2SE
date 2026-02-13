package  p2;
import p1.A;
/*
public class D{
	 void useAClass(){
	 	A a1=new A();
	 	//System.out.println("default field  "+a1.def);
		//a1.defaultFunction();
		//System.out.println("protected field  "+a1.proc);
		//a1.protectedFunction();
		System.out.println("public field  "+a1.pub);
		a1.publicFunction();

	 }

}
*/

public class D extends A{
	// members inherited  --> protected
	// members inherited  --> public 

	 void useAClass(){
	// 	A a1=new A();
	 	//System.out.println("default field  "+a1.def);
		//a1.defaultFunction();
		/*
		System.out.println("protected field  "+a1.proc);
		a1.protectedFunction();
		System.out.println("public field  "+a1.pub);
		a1.publicFunction();
		*/
		System.out.println("protected field  "+this.proc);
		this.protectedFunction();

	 }

	 public static void main(String[] args) {
	 	
	 	 D d1=new D();
	 	 System.out.println("protected field  "+d1.proc);
	   	d1.protectedFunction();
		System.out.println("public field  "+d1.pub);
		d1.publicFunction();
	 }


}