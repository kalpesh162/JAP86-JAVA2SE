import java.util.Scanner;
/*
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
*/

class Program1{

	static  void printPattern(int N){
		int cnt=15;
		for(int i=1;i<=N;i++){
				for(int j=1;j<=i;j++){
					System.out.print(cnt+"\t");
					cnt--;
				}
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