/*
54321
 5432
  543
   54
	5
   54
  543
 5432
54321
*/
class Program24{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int sp=1;sp<i;sp++)
			 		System.out.print(" ");

			 	for(int j=N;j>=i;j--)
			 		System.out.print(j);
			 }
			 else{

			 	for(int sp=1;sp<(2*N-i);sp++)
			 		System.out.print(" ");

			 	for(int j=N;j>=(2*N-i);j--)
			 		System.out.print(j);
			 }
			 System.out.println();
		}
	}
}