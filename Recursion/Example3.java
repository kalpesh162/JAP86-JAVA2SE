class Example3{
	
	void f1(int n){
			if(n<=0)
				return ;
			
			System.out.println(n);
			
			 if(n%2==0)
			 	f1(n-1);
			 else
			 	f1(n-2);
	}

	public static void main(String[] args) {
			f1(3);
	}
}