/*
5
45
345
2345
12345
*/
import java.util.Scanner;
class Program5{
	public static void main(String[] args) {
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N Value");
		N=scanner.nextInt();
		
		for(int i=N;i>=1;i--){
			for(int j=i;j<=N;j++){
				 System.out.print(j);
			}
			System.out.println();
		}
	}
}
