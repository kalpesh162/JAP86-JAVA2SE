class App{
	public static void f1(){
		System.out.println("IN F1");
		f2();
		System.out.println("END F1");
	}
	public static void f2(){
		System.out.println("IN F2");
		f3();
		System.out.println("END F2");
	}
	public static void f3(){
		System.out.println("IN F3");
		int x=11; int y=0;
		try{
		
		int res=x/y;  // abnormally terminate   [ArithmaticException]
		// internally new ArithmeticException();
		// new ArithmeticException("/ by zero");
		
		System.out.println(res);
		
		}catch(ArithmeticException e){
			System.out.println("Exception Caught "+e);
		}
		System.out.println("END F3");
	}

	public static void main(String[] args) {
		System.out.println("IN Main");
			f1();
		System.out.println("END Main");

		// code
	}
}

// What is an Exception Propagtion ?
// Redirect Exception to caller function called as Exception Propagtion




