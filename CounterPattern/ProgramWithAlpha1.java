import java.util.Scanner;
/*
A       B       C       D       E
F       G       H       I
J       K       L
M       N
O
*/
class ProgramWithAlpha1{

	public static void printPattern(int N){
		int cnt=1;
		for(int i=1;i<=N;i++){
			 for(int j=i;j<=N;j++){
			 	System.out.print((char)(cnt+64)+"\t");
			 	cnt++;
			 }
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