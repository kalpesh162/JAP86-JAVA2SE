import java.util.Scanner;
/*
1
2       6
3       7       10
4       8       11      13
5       9       12      14      15
*/

class Program5{

	static  void printPattern(int N){
		int cnt=1;
		for(int i=N;i>=1;i--){
			     int c=cnt;
				for(int j=N;j>=i;j--){
					System.out.print(c+"\t");
					c=c+(j-1);
				}
				cnt++;
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