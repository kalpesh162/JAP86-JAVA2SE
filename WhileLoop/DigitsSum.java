/*  Write a Java program to calculate the sum of digits of any number.*/
// 1234  -->10
import java.util.Scanner;
class DigitsSum{
	public static void main(String[] args) {
		int number; 
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		number=scanner.nextInt();

		while(number>0){
		int rem=number%10;
		sum=sum+rem;    //sum+=rem;
		System.out.println(rem);
		number=number/10;
	}

		System.out.println(sum);

	}
}