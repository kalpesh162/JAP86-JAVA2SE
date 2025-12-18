/*
    5
   54
  543
 5432
54321
*/
import java.util.Scanner;
class Program9{
	public static void main(String[] args) {
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N Value");
		N=scanner.nextInt();
		
		for(int i=N;i>=1;i--){

			for(int sp=1;sp<i;sp++)
				System.out.print(" ");
			
			// Print * Loop
			for(int j=5;j>=i;j--){
				 System.out.print(j);
			}
			System.out.println();
		}
	}
}
