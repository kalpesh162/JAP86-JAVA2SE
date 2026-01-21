class GreaterAvg{
	
	static double avgOfArray(int A[]){
		 int sum=0;
		 for(int i=0;i<A.length;i++)
		    sum+=A[i];
		return (sum*1.0)/A.length;
	}

	static void printGreaterThanAvg(int A[]){
			double avg=avgOfArray(A);
			System.out.println(avg);
			for(int i=0;i<A.length;i++){
				 if(A[i]>avg)
				 	System.out.print(A[i]+" ");
			}
	}
	public static void main(String[] args) {		
			int A[]={10,20,30,40,50};
			printGreaterThanAvg(A);
	}
}