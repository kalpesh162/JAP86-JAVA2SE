/*
*****
 ****
  ***
   **
	*
   **
  ***
 ****
*****
*/
class Program19{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int sp=1;sp<i;sp++)
			 		System.out.print(" ");

			 	for(int j=1;j<=(N-i+1);j++)
			 		System.out.print("*");
			 }
			 else{

			 	for(int sp=1;sp<(2*N-i);sp++)
			 		System.out.print(" ");

			 	for(int j=1;j<=i-N+1;j++)
			 		System.out.print("*");
			 }
			 System.out.println();
		}
	}
}