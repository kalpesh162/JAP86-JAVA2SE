/*
    5
   454
  34543
 2345432
123454321

*/

class Program9{
	public static void main(String[] args) {
		int N=5;

		for(int i=N;i>=1;i--){

			for(int sp=1;sp<i;sp++)
				System.out.print(" ");

			for (int j=i;j<=N;j++ ) {
				System.out.print(j);
			}
			for(int k=N-1;k>=i;k--)     
				System.out.print(k);

			System.out.println();
		}
		
	}
}