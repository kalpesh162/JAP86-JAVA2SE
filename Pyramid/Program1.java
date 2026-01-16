/*
*
***
*****
*******
*********


    *
   ***
  *****
 *******
*********
*/

class Program1{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){

			for(int sp=1;sp<=N-i;sp++)
				System.out.print(" ");

			for (int j=1;j<=(2*i-1) ;j++ ) {
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
}