package p1;

// Note This is standAlone class
// Not a Type Of A
public class C{

  void f1(){
  	 A a1=new A();
  	 	System.out.println("default field  "+a1.def);
		a1.defaultFunction();
		System.out.println("protected field  "+a1.proc);
		a1.protectedFunction();
		System.out.println("public field  "+a1.pub);
		a1.publicFunction();

  }

}