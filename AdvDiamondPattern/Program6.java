/*
1       1
21     12
321   123
4321 1234
543212345
*/

class Program6{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){

			if(i==1){
				for(int j=1;j<=N;j++)
					System.out.print(j);
				for(int j=N-1;j>=1;j--)
					System.out.print(j);

			}else{

				for(int k=1;k<=N-i+1;k++)
					System.out.print(k);
				
				for(int sp=1;sp<=(2*i)-3;sp++)
					System.out.print(" ");
				
				for(int k=N-i+1;k>=1;k--)
					System.out.print(k);
				
			}
			System.out.println();

		}

		for(int i=2;i<=N;i++){
			if(i==N){
				for(int j=1;j<=N;j++)
					System.out.print(j);
				for(int k=N-1;k>=1;k--)
					System.out.print(k);
			}
			else{

				for(int j=1;j<=i;j++)
					System.out.print(j);
				for(int sp=1;sp<=2*(N-i)-1;sp++)
					System.out.print(" ");

				for(int j=i;j>=1;j--)
					System.out.print(j);

			}
			System.out.println();
		}


	}
}