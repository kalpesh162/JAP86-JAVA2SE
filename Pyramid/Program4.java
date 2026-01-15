/*
*********    9    (2*5-1)
 *******     7    (2*4-1)
  *****      5
   ***       3
    *        1
*/

class Program4{
	public static void main(String[] args) {
		int N=5;

		for(int i=N;i>=1;i--){

			for(int sp=1;sp<=N-i;sp++)
				System.out.print(" ");

			for (int j=1;j<=(2*i-1) ;j++ ) {
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
}