/*Write a Java program to enter any number and print all factors of the number.*/
import java.util.Scanner;
class Factors{
	public static void main(String[] args) {
		
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		int i=1;

		while (i<num) {
				if(num%i==0)
					System.out.print(i+"  ");
			i++;
		}

	}
}