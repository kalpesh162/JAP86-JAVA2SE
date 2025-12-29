import java.util.Scanner;
/*
1
6       2
10      7       3
13      11      8       4
15      14      12      9       5
*/
class Program8{

	static  void printPattern(int N){
		int cnt=1;
		for(int i=N;i>=1;i--){
			     int c=cnt;
				for(int j=i;j<=N;j++){
					System.out.print(c+"\t");
					c=c-j;
				}
				cnt=cnt+i;
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