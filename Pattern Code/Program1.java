/*
*****
*****
*****
*****
*****
*/
import java.util.Scanner;
class Program1{
	public static void main(String[] args) {
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N Value");
		N=scanner.nextInt();
		for(int i=1;i<=N;i++){

			for(int j=1;j<=N;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}