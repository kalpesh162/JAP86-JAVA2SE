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
class Program9{
	
	 public static void main(String[] args) {
	 	int N=5;
	 	for(int i=1;i<=2*N-1;i++){

	 		if(i<=N){
				for(int j=N;j > N-i;j--){	 			
				   if(j%2!=0)
				   		System.out.print((char)(j+64));
				   	else
				   		System.out.print((char)(j+96));
				}
	 		}
	 		else{
				for(int j=N;j>i-N;j--){
				if(j%2!=0)
				   		System.out.print((char)(j+64));
				   	else
				   		System.out.print((char)(j+96));	 			
				 }
	 		}
	 		System.out.println();
	 	}

	 }
}