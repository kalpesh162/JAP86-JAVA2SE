/*Write a Java program to enter any number and print its reverse.*/
import java.util.Scanner;
class ReverseNumber{
	public static void main(String[] args) {

		int number; int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		number=scanner.nextInt();

		while (number>0) {
			int rem=number%10;
			sum=sum*10+rem;
			number=number/10;			
		}

		System.out.println(sum);
		
	}
}