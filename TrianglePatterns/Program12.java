/*
11111
 2222
  333
   44
    5
*/
import java.util.Scanner;
class Program12{
	public static void main(String[] args) {
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N Value");
		N=scanner.nextInt();
		
		for(int i=1;i<=N;i++){

			// Print Space
			for(int sp=1;sp<i;sp++)
				System.out.print(" ");
			
			// Print * Loop
			for(int j=i;j<=N;j++){
				 System.out.print(i);
			}
			System.out.println();
		}
	}
}
