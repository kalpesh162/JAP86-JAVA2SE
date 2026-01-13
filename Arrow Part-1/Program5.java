/*
1
21
321
4321
54321
4321
321
21
1
*/
class Program5{
	
	 public static void main(String[] args) {
	 	int N=5;
	 	for(int i=1;i<=2*N-1;i++){

	 		if(i<=N){
				for(int j=i;j>=1;j--)	 			
					System.out.print(j);
	 		}
	 		else{
				for(int j=(2*N-i);j>=1;j--)
				System.out.print(j);	 			
	 		}
	 		System.out.println();
	 	}

	 }
}