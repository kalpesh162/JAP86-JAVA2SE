/*
    5
   45
  345
 2345
12345
*/
import java.util.Scanner;
class Program11{
	public static void main(String[] args) {
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N Value");
		N=scanner.nextInt();
		
		for(int i=5;i>=1;i--){

			// Print Space
			for(int sp=1;sp<i;sp++)
				System.out.print(" ");
			
			// Print * Loop
			for(int j=i;j<=N;j++){
				 System.out.print(j);
			}
			System.out.println();
		}
	}
}
