import java.util.Scanner;
/*
Ea      Db      Cd      Bg      Ak
Ic      He      Gh      Fl
Lf      Ki      Jm
Nj      Mn
Oo
*/
class Program2{
	public static void printPattern(int N){
		int cnt1=N;
		int cnt2=1;

		for(int i1=N,i2=1;i2<=N;i2++,i1--){
 				int c2=cnt2;
 				int c1=cnt1;

 				for(int j1=i1,j2=i2; j1>=1 ; j1--,j2++){
 					System.out.print((char)(c1+64));
 					System.out.print((char)(c2+96)+"\t");
 					c1--;
 					c2=c2+j2;
 				}

 				cnt2=cnt2+(i2+1);
 				cnt1=cnt1+(i1-1);
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