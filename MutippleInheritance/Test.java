interface Payment{
	 void netBanking();
	 
	 default void UPI(){
	 	System.out.println("UPI ");
	 }
	 // while Overriding default method in subclass make sure Access Modifier must 
	 // be public
	// default method are not mandatory to override
	static void f1(){
		System.out.println("Payment f1()");
	}

	// Uility Mthods	 
}

class SBI implements Payment{
	@Override
	public  void netBanking(){

		System.out.println("SBI netBanking");
	}
	/*
	@Override
	public void UPI(){
		System.out.println("SBI UPI");
	}
	*/

	/*
	@Override
	protected void UPI(){
		System.out.println("SBI UPI");
	}
	*/
}

@FunctionalInterface
interface One{
	 void f1();
	 // trying to add more abstarct method
	 //void f2();
}

class Test{
	public static void main(String[] args) {
		Payment p1=new SBI();
		p1.netBanking();
		p1.UPI();	

		System.out.println("((((())))))");

		Payment.f1();
		//SBI.f1();  //  cannot find symbol
	}
}