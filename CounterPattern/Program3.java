import java.util.Scanner;
/*
1
3       2
6       5       4
10      9       8       7
15      14      13      12      11
*/
class Program3{

	static  void printPattern(int N){
		int cnt=1;
		for(int i=1;i<=N;i++){
			     int c=cnt;
				for(int j=1;j<=i;j++){
					System.out.print(c+"\t");
					c--;
				}
				cnt=cnt+(i+1);
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