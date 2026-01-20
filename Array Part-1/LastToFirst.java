class LastToFirst{	
	static void display(int A[]){
		for(int i=0;i<A.length;i++){
				System.out.print(A[i]+"  ");
		}
			System.out.println();
	  }

	  static void lastToFirst(int A[]){
	  		// cases
	  	int temp=A[A.length-1];
	  	for(int i=A.length-1;i>0;i--)
	  		A[i]=A[i-1];

	  	A[0]=temp;
	  }

	public static void main(String[] args) {

		int A[]={11,22,33,44,55};
		display(A);
		lastToFirst(A);
		display(A);
	}
}