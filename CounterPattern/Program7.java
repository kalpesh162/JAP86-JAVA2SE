import java.util.Scanner;
/*
11
12      7
13      8       4
14      9       5       2
15      10      6       3       1
*/
class Program7{

	static  void printPattern(int N){
		int cnt=(N*(N-1))/2+1;
		for(int i=N;i>=1;i--){
			     int c=cnt;
				for(int j=N;j>=i;j--){
					System.out.print(c+"\t");
					c=c-j;
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