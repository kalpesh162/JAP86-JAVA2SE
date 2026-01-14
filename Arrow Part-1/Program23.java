/*
12345
 2345
  345
   45
	5
   45
  345
 2345
12345
*/
class Program23{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int sp=1;sp<i;sp++)
			 		System.out.print(" ");

			 	for(int j=i;j<=N;j++)
			 		System.out.print(j);
			 }
			 else{

			 	for(int sp=1;sp<(2*N-i);sp++)
			 		System.out.print(" ");

			 	for(int j=(2*N-i);j<=N;j++)
			 		System.out.print(j);
			 }
			 System.out.println();
		}
	}
}