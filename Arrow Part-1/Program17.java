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
class Program17{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int sp=1;sp<=N-i;sp++)
			 		System.out.print(" ");
			 	for(int j=N;j>=(N-i+1);j--)
			 		System.out.print(j);
			 }
			 else{
			 	for(int sp=1;sp<i-N+1;sp++)
			 		System.out.print(" ");

			 	for(int j=N ;j>=(i-N+1);j--)
			 		System.out.print(j);
			 }
			 System.out.println();
		}
	}
}