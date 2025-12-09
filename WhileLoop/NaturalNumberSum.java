/*Write a Java program to find the sum of all natural numbers between 1 to n.*/
import java.util.Scanner;
class NaturalNumberSum{
	public static void main(String[] args) {
		int start=1;
		int N;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N Value");
		N=scanner.nextInt();

		while(start<=N){
			sum=sum+start;
			start++;
		}

		System.out.println(sum);
	}
}
