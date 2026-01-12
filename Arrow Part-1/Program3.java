/*
1
12
123
1234
12345
1234
123
12
1
*/
class Program3{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<=2*N-1;i++){
				if(i<=N){
					for(int j=1;j<=i;j++)
						System.out.print(j);
					System.out.println();
				}
				else{
					for(int j=1;j<=(2*N)-i;j++)
						System.out.print(j);
					System.out.println();
				}

		}
	}
}