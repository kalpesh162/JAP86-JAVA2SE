import java.util.Scanner;
/*
STEP 1
15      13      10      6       1
14      11      7       2
12      8       3
9       4
5

STEP 2

O       M       J       F       A
N       K       G       B
L       H       C
I       D
E


STEP 3

O       M       J       F       A
        N       K       G       B
                L       H       C
                        I       D
                                E




*/
class Program1{

	public static void printPattern(int N){
		int cnt2=(N*(N+1))/2;
		for(int i2=1;i2<=N;i2++){
 				int c2=cnt2;

 				for(int sp=1;sp<i2;sp++)
 					System.out.print("\t");

 				for(int j2=i2;j2<=N;j2++){
 					System.out.print((char)(c2+64)+"\t");
 					c2=c2-(j2+1);
 				}

 				cnt2=cnt2-i2;
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