class Example4{
	
	void f1(int n){
			if(n<=0)
				return ;
			
			System.out.println(n);
			 	f1(n-1);
			 	f1(n-2);
	}

	public static void main(String[] args) {
			f1(3);
	}
}