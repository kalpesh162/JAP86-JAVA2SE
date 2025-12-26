import java.util.Scanner;
/*
15
14      13
12      11      10
9       8       7       6
5       4       3       2       1
*/

class Program2{

	static  void printPattern(int N){
		int cnt=(N*(N+1))/2;
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