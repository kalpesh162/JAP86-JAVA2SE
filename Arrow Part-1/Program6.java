/*
5
54
543
5432
54321
5432
543
54
5
*/
class Program6{
	
	 public static void main(String[] args) {
	 	int N=5;
	 	for(int i=1;i<=2*N-1;i++){

	 		if(i<=N){
				for(int j=N;j > N-i;j--)	 			
					System.out.print(j);
	 		}
	 		else{
				for(int j=N;j>i-N;j--)
				System.out.print(j);	 			
	 		}
	 		System.out.println();
	 	}

	 }
}