import java.io.File;
import java.io.IOException;
class Example1{
	public static void f1() throws IOException,InterruptedException{
		System.out.println("f1");
			f2();
		System.out.println("f1 END");
	}
	public static void f2() throws IOException,InterruptedException{
		System.out.println("f2");
			f3();	
		System.out.println("f2 END");
	}
	// we can throws multiple Exception at a time

	public static void f3() throws IOException,InterruptedException{
		System.out.println("f3");
		// System.out.print(11/0);  Unchecked Exception
		File file=new File("Hello.txt");
		file.createNewFile();  // IOException

		Thread.sleep(300);
	}
	public static void main(String[] args) throws IOException,InterruptedException {
		System.out.println("Main");
		f1();
		System.out.println("Main END");
	}
}
// What is throws ?
// [if we use throws keyword to Unchecked Exception it just a reduntatnt]
// Unchecked Exception implicitely redirected to called method
// What is Exception Propagation
// redirect an Exception to called Function called as Exception Propagation

 // throws keyword generally use with checked Exception
 // throws can throws multiple Exception at a time  [one or more ]
// throws is used only with methods
// syntax  public void f1() throws ClassNotFoundException


// In the f3() function has a lol code
/*
	public static void f3() throws IOException,InterruptedException{
		System.out.println("f3");
		// System.out.print(11/0);  Unchecked Exception
		File file=new File("Hello.txt");
		file.createNewFile();  // IOException

		Thread.sleep(300);
  // exceptions ...
	}



	public static void f3() throws Exception{
		System.out.println("f3");
		// System.out.print(11/0);  Unchecked Exception
		File file=new File("Hello.txt");
		file.createNewFile();  // IOException

		Thread.sleep(300);
  // exceptions ...
	}

*/