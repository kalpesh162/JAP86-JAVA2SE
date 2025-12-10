/* Write a Java program to count the number of digits in any number.  */
import java.util.Scanner;
class CountDigits{
	public static void main(String[] args) {
		int number; 
		int cnt=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		// 2147483647   -2147483648
		number=scanner.nextInt();
		if(number<0)
			number=number*-1;
		if(number==0)
			cnt=1;
		while(number!=0){
			number=number/10;  // number/=10;
			cnt++;
		}
		System.out.println("No Of Digits  "+cnt);
		System.out.println("--------Ranges----------");
		System.out.println("Byte");
		System.out.println("MAX "+Byte.MAX_VALUE);
		System.out.println("MIN "+Byte.MIN_VALUE);
		System.out.println("------------------");
		System.out.println("Short");
		System.out.println("MAX "+Short.MAX_VALUE);
		System.out.println("MIN "+Short.MIN_VALUE);
		System.out.println("------------------");

		System.out.println("Integer");
		System.out.println("MAX "+Integer.MAX_VALUE);
		System.out.println("MIN "+Integer.MIN_VALUE);
		System.out.println("------------------");
		System.out.println("Long");
		System.out.println("MAX "+Long.MAX_VALUE);
		System.out.println("MIN "+Long.MIN_VALUE);
		System.out.println("------------------");
	}
}