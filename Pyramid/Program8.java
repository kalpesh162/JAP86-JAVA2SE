/*

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/

class Program8{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){

			for(int sp=1;sp<=N-i;sp++)
				System.out.print(" ");

			for (int j=1;j<=(2*i-1) ;j++ ) {
				if(j==1 || j==(2*i-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

			for(int i=N-1;i>=1;i--){

			for(int sp=1;sp<=N-i;sp++)
				System.out.print(" ");

			for (int j=1;j<=(2*i-1) ;j++ ) {
					if(j==1 || j==(2*i-1))
					System.out.print("*");
					else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}