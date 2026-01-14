/*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/
class Program13{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int sp=1;sp<=N-i;sp++)
			 		System.out.print(" ");
			 	for(int j=1;j<=i;j++)
			 		System.out.print("*");
			 }
			 else{

			 	for(int sp=1;sp<i-N+1;sp++)
			 		System.out.print(" ");

			 	for(int j=1;j<=(2*N-i);j++)
			 		System.out.print("*");
			 }
			 System.out.println();
		}
	}
}