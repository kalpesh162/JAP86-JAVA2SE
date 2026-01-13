/*
1
22
333
4444
55555
4444
333
22
1
*/

class Program4{
	
	 public static void main(String[] args) {
	 	int N=5;
	 	for(int i=1;i<=2*N-1;i++){

	 		if(i<=N){
				for(int j=1;j<=i;j++)	 			
					System.out.print(i);
	 		}
	 		else{
				for(int j=1;j<=(2*N)-i;j++)
				System.out.print(2*N-i);	 			
	 		}
	 		System.out.println();
	 	}

	 }
}