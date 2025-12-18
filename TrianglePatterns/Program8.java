/*
    1
   22
  333
 4444
55555
*/
import java.util.Scanner;
class Program8{
	public static void main(String[] args) {
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N Value");
		N=scanner.nextInt();
		
		for(int i=1;i<=N;i++){

			// Space loop
			for(int sp=i;sp<N;sp++)
				System.out.print(" ");
			
			// Print * Loop
			for(int j=1;j<=i;j++){
				 System.out.print(i);
			}
			System.out.println();
		}
	}
}
