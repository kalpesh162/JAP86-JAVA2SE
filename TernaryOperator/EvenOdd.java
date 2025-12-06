// Program to Check Even Odd Using Ternary Operator
import java.util.Scanner;
class EvenOdd{

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num");
		num=scanner.nextInt();
		/*
		 error: not a statement
                (num%2==0) ? System.out.println("Even") : System.out.println("Odd");
		*/
		//(num%2==0) ? System.out.println("Even") : System.out.println("Odd");

		boolean ans=num%2==0 ? true : false;

		// ""  --> String

		String msg=num%2==0 ? "Even" : "Odd";

		System.out.println(msg);
		
	}
}