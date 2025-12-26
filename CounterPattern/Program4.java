import java.util.Scanner;
/*
15
13      14
10      11      12
6       7       8       9
1       2       3       4       5

*/

class Program4{

	static  void printPattern(int N){
		int cnt=(N*(N+1))/2;
		for(int i=1;i<=N;i++){
			     int c=cnt;
				for(int j=1;j<=i;j++){
					System.out.print(c+"\t");
					c++;
				}
				cnt=cnt-(i+1);   // cnt-i-1     15-1-1   ==13
				System.out.println();
			}	
	}
	public static void main(String[] args) {
		int N;
		System.out.println("Enter N Value");
		Scanner scanner=new Scanner(System.in);
		N=scanner.nextInt();
		printPattern(N);	
	}
}
//cnt=cnt-(i+1);   // cnt-i-1     15-1-1   ==13
								//13-2-1     10 
								//10-3-1     6
								//6-4-1      1 
