class MinumArrayElement{
	static int findMax(int A[]){
		if(A==null)
			return;
		if(A.length==1)
			return A[0];

		int max=A[0];
		for(int i=1;i<A.length;i++)
			if(max<A[i])
				max=A[i];

		return max;
	}

	static int findMin(int A[]){
			if(A==null)
			return;
			if(A.length==1)
			return A[0];
		
		int min=A[0];
		for(int i=1;i<A.length;i++)
			if(min>A[i])
				min=A[i];

		return min;
	}

	public static void main(String[] args) {
			//int A[]={12,45,67,23,89,34};
			int A[]=null;

			System.out.println("Max Element  "+findMax(A));
			System.out.println("Min Element  "+findMin(A));
	}
}