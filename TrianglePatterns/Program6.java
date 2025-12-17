/*
a
ba
cba
dcba
edcba
*/
import java.util.Scanner;
class Program6{
	public static void main(String[] args) {
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N Value");
		N=scanner.nextInt();
		
		for(int i=1;i<=N;i++){
			for(int j=i;j>=1;j--){
				 System.out.print((char)(96+j));
			}
			System.out.println();
		}
	}
}
