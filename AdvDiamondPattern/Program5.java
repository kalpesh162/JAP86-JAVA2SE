/*
1       1
21     12
321   123
4321 1234
543212345
*/

class Program5{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){

			if(i==N){
				for(int j=N;j>=1;j--)
					System.out.print(j);
				for(int j=2;j<=N;j++)
					System.out.print(j);
			}else{
				for(int k=i;k>=1;k--)
					System.out.print(k);
				
				for(int sp=1;sp<=(2*(N-i))-1;sp++)
					System.out.print(" ");
				
				for(int k=1;k<=i;k++)
					System.out.print(k);		
			}
			System.out.println();

		}

	}
}