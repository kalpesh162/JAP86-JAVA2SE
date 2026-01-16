/*
111111111
2222 2222
333   333
44     44
5       5
*/

class Program1{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){

			if(i==1){
				for(int j=1;j<2*N;j++)
					System.out.print(i);

			}else{

				for(int k=i;k<=N;k++)
					System.out.print(i);
				
				for(int sp=1;sp<=(2*i)-3;sp++)
					System.out.print(" ");
				for(int k=i;k<=N;k++)
					System.out.print(i);
			}
			System.out.println();

		}

	}
}