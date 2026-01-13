/*
54321
4321
321
21
1
21
321
4321
54321
*/
class Program12{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int j=(N+1-i);j>=1;j--)
			 		System.out.print(j);
			 }
			 else{

			 	for(int j=i-N+1;j>=1;j--)
			 		System.out.print(j);		
			 }
			 System.out.println();
		}
	}
}