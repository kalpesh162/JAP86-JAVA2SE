class FirstToLast{
	static void firstToLast(int A[]){
		if(A==null) return;

		if(A.length==1)
			return ;
		if(A.length==2){
			// Swap Without Third Variable
			int first=A[0];
			A[0]=A[1];
			A[1]=first;
			return;
		}
		int temp=A[0];
		for(int i=0;i<A.length-1;i++)
			A[i]=A[i+1];
		A[A.length-1]=temp;
	}
	static void display(int A[]){
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int A[]={11,22,33,44,55};
		display(A);
		firstToLast(A);
		display(A);


	}
}