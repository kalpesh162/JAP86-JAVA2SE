import java.util.Scanner;
class Program1{
	static void display(int A[][]){
		for(int i=0;i<A.length;i++){

			for(int j=0;j<A[i].length;j++){
				System.out.print("["+i + "" + j +" ]  " + A[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//int A[][]={{11,22,33},{44,55,66},{77,88,99}};
		//int [][]A=new int[][]{{11,22,33},{44,55,66},{77,88,99}};
		int A[][]=new int[3][3];

		for(int i=0;i<A.length;i++){

			for(int j=0;j<A[i].length;j++){
				//System.out.print(A[i][j]+"  ");
				System.out.println("ENTER ");
				A[i][j]=scanner.nextInt();				
			}
		}
		display(A);
	}
}



import java.util.Scanner;
class Program1{
	static void display(int A[][]){
		for(int i=0;i<A.length;i++){

			for(int j=0;j<A[i].length;j++){
				System.out.print("["+i + "" + j +" ]  " + A[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//int A[][]={{11,22,33},{44,55,66},{77,88,99}};
		//int [][]A=new int[][]{{11,22,33},{44,55,66},{77,88,99}};
		int A[][]=new int[3][3];

		for(int i=0;i<A.length;i++){

			for(int j=0;j<A[i].length;j++){
				//System.out.print(A[i][j]+"  ");
				System.out.println("ENTER ");
				A[i][j]=scanner.nextInt();				
			}
		}
		display(A);
	}
}