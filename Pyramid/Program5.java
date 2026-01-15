/*
* * * * *
 * * * *
  * * *
   * *
    *
*/

class Program5{
	public static void main(String[] args) {
		int N=5;

		for(int i=N;i>=1;i--){

			for(int sp=1;sp<=N-i;sp++)
				System.out.print(" ");

			for (int j=1;j<=(2*i-1) ;j++ ) {
				if(j%2!=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}