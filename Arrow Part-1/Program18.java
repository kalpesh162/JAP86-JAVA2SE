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
class Program18{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int sp=1;sp<=N-i;sp++)
			 		System.out.print(" ");
			 	for(int j=N-i+1;j<=N;j++)
			 		System.out.print(j);
			 }
			 else{
			 	for(int sp=1;sp<i-N+1;sp++)
			 		System.out.print(" ");

			 	for(int j=i-N+1;j<=N;j++)
			 		System.out.print(j);
			 }
			 System.out.println();
		}
	}
}