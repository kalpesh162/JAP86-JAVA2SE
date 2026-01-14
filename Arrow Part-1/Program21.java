/*
11111
 2222
  333
   44
	5
   44
  333
 2222
11111
*/
class Program21{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int sp=1;sp<i;sp++)
			 		System.out.print(" ");

			 	for(int j=1;j<=(N-i+1);j++)
			 		System.out.print(i);
			 }
			 else{

			 	for(int sp=1;sp<(2*N-i);sp++)
			 		System.out.print(" ");

			 	for(int j=1;j<=i-N+1;j++)
			 		System.out.print(2*N-i);
			 }
			 System.out.println();
		}
	}
}