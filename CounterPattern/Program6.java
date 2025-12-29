import java.util.Scanner;
/*
5
4       9
3       8       12
2       7       11      14
1       6       10      13      15
*/
class Program6{

	static  void printPattern(int N){
		int cnt=N;
		for(int i=N;i>=1;i--){
			     int c=cnt;
				for(int j=N;j>=i;j--){
					System.out.print(c+"\t");
					c=c+j;
				}
				cnt--;
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