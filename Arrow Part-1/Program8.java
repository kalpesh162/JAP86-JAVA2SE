/*
5
45
345
2345
12345
2345
345
45
5
*/
class Program8{
	
	 public static void main(String[] args) {
	 	int N=5;
	 		for(int i=1;i<2*N;i++){

	 			if(i<=N){
                   for(int j=N-i+1; j<=N;j++){
                   	System.out.print(j);
                   }
	 			}
	 			else{

	 				for(int j=i-N+1; j<=N;j++){
                   	System.out.print(j);
                   }

	 			}
	 			System.out.println();
	 		} 		
	 }
}