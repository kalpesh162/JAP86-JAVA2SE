/*
55555
4444
333
22
1
22
333
4444
55555
*/
class Program11{
	public static void main(String[] args) {
		int N=5;
		for(int i=1;i<2*N;i++){
			 if(i<=N){
			 	for(int j=1;j<=(N+1-i);j++)
			 		System.out.print(N+1-i);
			 }
			 else{

			 	for(int j=1;j<=(i-N)+1;j++)
			 		System.out.print(i-N+1);		
			 }
			 System.out.println();
		}
	}
}