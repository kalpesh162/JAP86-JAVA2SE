import java.util.Scanner;
/*
12345
22345
33345
44445
55555
*/
class Example3{
	static  void printPattern(int N){

		for(int i=1;i<=N;i++){
			for(int j=i;j>=1;j--)
				System.out.print(i);

			for(int k=i+1;k<=N;k++)
				System.out.print(k);				
			System.out.println();
		}	
	}
	static  void printPattern1(int N){
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++)
			{
				if(j<i)
					System.out.print(i);
				else
					System.out.print(j);
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