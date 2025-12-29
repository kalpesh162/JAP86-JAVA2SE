import java.util.Scanner;
/*
11111
22221
33321
44321
54321
*/

class Example1{
	static  void printPattern(int N){

		for(int i=1;i<=N;i++){
			for(int j=i;j<N;j++)
				System.out.print(i);

			for(int k=i;k>=1;k--)
				System.out.print(k);				
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int N;
		System.out.println("Enter N Value");
		Scanner scanner=new Scanner(System.in);
		N=scanner.nextInt();
		printPattern(N);	
	}

}