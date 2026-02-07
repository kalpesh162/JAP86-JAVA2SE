class A{
	 static int num=11;

	 static void f1(){
	 	System.out.println("f1 in A class");
	 }
}

class B extends A{

		// if we apply @Override then compiler give an Error
	 static void f1(){
	 	System.out.println("f1 in B class");
	 	//super.f1(); this and super cant be use in static context
	 	A.f1();
	 }

}

// static fields and static function/method can be inherited

class Test{
	public static void main(String[] args) {
		
		System.out.println(A.num);
		System.out.println(B.num);

		B.f1();
	}
}