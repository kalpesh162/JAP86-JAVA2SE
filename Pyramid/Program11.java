/*
543212345
 5432345
  54345
   545
    5
    5
   545
  54345
 5432345
543212345

*/

class Program11{
	public static void main(String[] args) {
		int N=5;
	
		for(int i=1;i<=N;i++){

			for(int sp=1;sp<i;sp++)
				System.out.print(" ");

			for (int j=N;j>=i;j-- ) {
				System.out.print(j);
			}

			for(int k=i+1;k<=N;k++)     {
				System.out.print(k);
			}

			System.out.println();
		}

		for(int i=N-1;i>=1;i--){

			for(int sp=1;sp<i;sp++)
				System.out.print(" ");

			for (int j=N;j>=i;j-- ) {
				System.out.print(j);
			}

			for(int k=i+1;k<=N;k++)     {
				System.out.print(k);
			}

			System.out.println();
		}
		
	}
}