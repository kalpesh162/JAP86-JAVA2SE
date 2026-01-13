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
class Program7{
	
	 public static void main(String[] args) {
	 	int N=5;
	 		
	 		for(int i=N;i>=1;i--){
	 			 for(int j=i;j<=N;j++)
	 			 	System.out.print(j);
	 			 System.out.println();
	 			}

	 			for(int i=2;i<=N;i++){
	 				for(int j=i;j<=N;j++)
	 					System.out.print(j);
	 				System.out.println();
	 			}

	 }
}