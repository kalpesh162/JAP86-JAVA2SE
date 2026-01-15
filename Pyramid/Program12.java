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


EdCbAbCdE
 EdCbCdE
  EdCdE
   EdE
    E
   EdE
  EdCdE
 EdCbCdE
EdCbAbCdE

*/

class Program12{
	public static void main(String[] args) {
		int N=5;
	
		for(int i=1;i<=N;i++){

			for(int sp=1;sp<i;sp++)
				System.out.print(" ");

			for (int j=N;j>=i;j-- ) {
				if(j%2!=0)
				System.out.print((char)(j+64));
				else
				System.out.print((char)(j+96));
			}

			for(int k=i+1;k<=N;k++)     {
				if(k%2!=0)
				System.out.print((char)(k+64));
				else
				System.out.print((char)(k+96));

			}

			System.out.println();
		}

		for(int i=N-1;i>=1;i--){

			for(int sp=1;sp<i;sp++)
				System.out.print(" ");

			for (int j=N;j>=i;j-- ) {
				if(j%2!=0)
				System.out.print((char)(j+64));
				else
				System.out.print((char)(j+96));

			}

			for(int k=i+1;k<=N;k++)     {
				if(k%2!=0)
				System.out.print((char)(k+64));
				else
				System.out.print((char)(k+96));

			}

			System.out.println();
		}
		
	}
}