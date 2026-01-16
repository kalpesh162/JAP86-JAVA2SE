/*
555555555
4444 4444
333   333
22     22
1       1
*/

class Program2{
	public static void main(String[] args) {
		int N=5;

		for(int i=N;i>=1;i--){

			if(i==N){
				for(int j=1;j<2*N;j++)
					System.out.print(i);

			}else{

				for(int k=1;k<=i;k++)
					System.out.print(i);
				
				for(int sp=1;sp<=(2*(N-i))-1;sp++)
					System.out.print(" ");
				
				for(int k=1;k<=i;k++)
					System.out.print(i);
				
			}
			System.out.println();

		}

	}
}