/*  Write a Java program to print a multiplication table of any number.*/
import java.util.Scanner;
class Table{
	public static void main(String[] args) {
		int num;	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		num=scanner.nextInt();
		int i=1;
		// 5 * 1 = 5
		while (i<=10) {
			System.out.println(num + " * " + i + " = "+ (num*i));
			i++;
		}
	}
}