import java.util.Scanner;
/*
1       2       4       7       11
        3       5       8       12
                6       9       13
                        10      14
                                15
*/
class ProgramWithSpace3{

	public static void printPattern(int N){
		int cnt=1;
		for(int i=1;i<=N;i++){

			for(int sp=i;sp>1;sp--)
				System.out.print("\t");
				int c=cnt;
			 for(int j=i;j<=N;j++){
			 	System.out.print(c +"\t");
			 		c=c+j;
			 }
			 	cnt+=(i+1);
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