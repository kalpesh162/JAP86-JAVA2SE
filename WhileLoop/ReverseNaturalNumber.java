/*  Write a Java program to print all natural numbers in reverse (from n to 1). - using while loop*/
import java.util.Scanner;
class ReverseNaturalNumber{
	public static void main(String[] args) {
		
		int start=1;
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter End(N) Value  ");
		N=scanner.nextInt();
		// start<=N
		//
		while (start<=N) {
			System.out.print(N + " ");
			N--;
		}
	}
}