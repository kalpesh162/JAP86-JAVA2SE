/*
*
**
* *
*  *
*****


 *
11  12  13  14  15
 *   *
21  22  23  24  25
 *   *   *
31  32  33  34  35
 *   *   *   *
41  42  43  44  45
 *   *   *   *   *
51  52  53  54  55
*/
import java.util.Scanner;
class Program2{
	public static void main(String[] args) {
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N Value");
		N=scanner.nextInt();
		
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				if(j==1 || i==N || i==j)
				 System.out.print("*");
				else
				 System.out.print(" ");
			}
			System.out.println();
		}
	}
}
