class ReverseArray{

	public static void reverse(int A[]){
		if(A==null)
			return;
		if(A.length==1)
			return;
		if(A.length==2){
			// swap
			return;
		}
		
		for(int i=0,j=A.length-1;i<j;i++,j--){
			int temp=A[i];
			A[i]=A[j];
			A[j]=temp;
		}
	}
	public static void reverseWithoutThirdVariable(int A[]){
		
		for(int i=0,j=A.length-1;i<j;i++,j--){
			A[i]=A[i]+A[j];
			A[j]=A[i]-A[j];
			A[i]=A[i]-A[j];
		}
	}
	public static void display(int A[]){
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+ "  ");

		System.out.println();
	}
	
	public static void main(String[] args) {
		int A[]={11,22,33,44,55};
		display(A);
		//reverse(A);
		reverseWithoutThirdVariable(A);
		display(A);


	}
}