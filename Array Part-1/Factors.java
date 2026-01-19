class Factors{
	
	static void printFactor(int n){
		 for(int i=1;i<n;i++){
		 	if(n%i==0)
		 		System.out.print(i);
		 }
	}

	static int[] getAllFactors(int n){
		
		int cnt=0;
		 for(int i=1;i<n;i++){
		 	if(n%i==0)
		 		cnt++;
		 }
		 int index=0;
		int factor[]=new int[cnt]; 
		 for(int i=1;i<n;i++){
		 	if(n%i==0){
		 		factor[index]=i;
		 		index++;
		 	}
		 }

		 return factor;
	}

	public static void main(String[] args) {
		
		int num=32;
		// code
		int A[]=getAllFactors(num);

		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+" ");


	}
}