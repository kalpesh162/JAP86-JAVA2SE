import java.util.Scanner;
/*
54321
54322
54333
54444
55555
*/

class Example2{
	static  void printPattern(int N){

		for(int i=1;i<=N;i++){
			for(int j=N;j>i;j--)
				System.out.print(j);

			for(int k=1;k<=i;k++)
				System.out.print(i);				
			System.out.println();
		}	
	}
	static  void printPattern1(int N){
		for(int i=1;i<=N;i++){
			for(int j=N;j>=1;j--)
			{
				if(j>i)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int N;
		System.out.println("Enter N Value");
		Scanner scanner=new Scanner(System.in);
		N=scanner.nextInt();
		printPattern(N);
		System.out.println();
		printPattern1(N);	
	}

}