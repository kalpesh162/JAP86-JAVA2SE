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
class Program15{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int sp=1;sp<=N-i;sp++)
			 		System.out.print(" ");
			 	for(int j=1;j<=i;j++)
			 		System.out.print(i);
			 }
			 else{

			 	for(int sp=1;sp<i-N+1;sp++)
			 		System.out.print(" ");

			 	for(int j=1;j<=(2*N-i);j++)
			 		System.out.print((2*N)-i);
			 }
			 System.out.println();
		}
	}
}