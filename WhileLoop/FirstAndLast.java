/* Write a Java program to find the first and last digit of any number.*/
// num=1234    unit=4   th=1
import java.util.Scanner;
class FirstAndLast{
	public static void main(String[] args) {
		int number; 
		int cnt=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		// 2147483647   -2147483648
		number=scanner.nextInt();
		int unit=number%10;

		while(number>9){
			number=number/10; // number/=10
		}

		int last=number;

		System.out.println(first);
		System.out.println(last);
		
	}
}