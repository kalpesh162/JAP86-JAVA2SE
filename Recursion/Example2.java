class Example2{

	static void f1(int n){
		if(n==0)
			return ;
		
		 f1(n-1);
		 System.out.println(n);
	}

	public static void main(String[] args) {
			f1(5);
	}
}