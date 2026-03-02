import java.io.IOException;
import java.io.FileNotFoundException;

class A{
	 void f1() throws FileNotFoundException{
	 	System.out.println("A class f1()");
	 }
}

class B extends A{
	// overridden method does not throw IOException
	@Override
	void f1() throws IOException{
		System.out.println("B class f1()");
	 }
}

class Twister4{
	public static void main(String[] args)  {
			A a1=new B();
			try{
			a1.f1();
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("*******");
	}
}