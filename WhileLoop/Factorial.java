//Write a Java program to enter any number and calculate its factorial.
// 5!   5*4*3*2*1
import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		int sum=1;
		while (num>=1) {
			sum=sum*num;
			num--;
		}
	
		System.out.println(sum);

		
	}
}