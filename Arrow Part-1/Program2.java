/*
*
**
***
****
*****
****
***
**
*
*/
class Program2{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<=2*N-1;i++){
				if(i<=N){
					for(int j=1;j<=i;j++)
						System.out.print("*");
					System.out.println();
				}
				else{
					for(int j=i;j<=(2*N-1);j++)
						System.out.print("*");
					System.out.println();
				}

		}
	}
}