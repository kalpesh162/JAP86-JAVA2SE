import java.util.Scanner;
/*
                                1
                        2       3
                4       5       6
        7       8       9       10
11      12      13      14      15
*/
class ProgramWithSpace2{

	public static void printPattern(int N){
		int cnt=1;
		for(int i=1;i<=N;i++){

			for(int sp=i;sp<N;sp++)
				System.out.print("\t");

			 for(int j=i;j>=1;j--)
			 	System.out.print(cnt++ +"\t");

			 System.out.println();
		}

	}

	public static void main(String[] args) {
			int N;
		System.out.println("Enter N ");
			Scanner scanner=new Scanner(System.in);
			N=scanner.nextInt();
			printPattern(N);	
	}
}