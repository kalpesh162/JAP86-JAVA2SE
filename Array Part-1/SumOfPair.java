class SumOfPair{

	static void findPairs(int A[],int sum){
		// add edge cases
		for(int i=0;i<A.length-1;i++){
			  for(int j=i+1;j<A.length;j++){
			  	   if(sum==(A[i]+A[j]))
			  	   	System.out.println(A[i]+"  "+A[j]);
			  }
		}

	}

	public static void main(String[] args) {
		
		int A[]={4,8,12,16};
		int target=20;
		findPairs(A,target);
	}
}