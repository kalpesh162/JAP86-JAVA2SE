/*  Write a Java program to print all natural numbers from 1 to n. - using while loop*/
import java.util.Scanner;
class NaturalNumber{
	public static void main(String[] args) {
		
		int start=1;
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter End(N) Value  ");
		N=scanner.nextInt();
		// start<=N
		while (start<=N) {
			System.out.print(start + " ");
			start++;
		}
	}
}