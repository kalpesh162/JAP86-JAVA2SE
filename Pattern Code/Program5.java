/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
*/
import java.util.Scanner;
class Program5{
	public static void main(String[] args) {
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N Value");
		N=scanner.nextInt();
		for(int i=1;i<=N;i++){

			for(int j=1;j<=N;j++){
				System.out.print((char)(64+i));				
			}
			
			System.out.println();
		}
	}
}