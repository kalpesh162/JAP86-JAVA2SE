/*
123454321
2345 5432
345   543
45     54
5       5
*/

class Program3{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){

			if(i==1){
				for(int j=1;j<=N;j++)
					System.out.print(j);
				for(int j=N-1;j>=1;j--)
					System.out.print(j);

			}else{

				for(int k=i;k<=N;k++)
					System.out.print(k);
				
				for(int sp=1;sp<=(2*i)-3;sp++)
					System.out.print(" ");
				
				for(int k=N;k>=i;k--)
					System.out.print(k);
				
			}
			System.out.println();

		}

	}
}