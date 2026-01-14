/*
55555
 4444
  333
   22
	1
   22
  333
 4444
55555
*/
class Program20{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int sp=1;sp<i;sp++)
			 		System.out.print(" ");

			 	for(int j=1;j<=(N-i+1);j++)
			 		System.out.print(N-i+1);
			 }
			 else{

			 	for(int sp=1;sp<(2*N-i);sp++)
			 		System.out.print(" ");

			 	for(int j=1;j<=i-N+1;j++)
			 		System.out.print(i-N+1);
			 }
			 System.out.println();
		}
	}
}