import java.util.Scanner;
class Program3{
	public static void main(String[] args) {
		int rows; int col;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No Of Rows");
		rows=scanner.nextInt();
		
		int A[][]=new int[rows][];	

	     for(int i=0;i<A.length;i++){
	     	System.out.println("Enter No Of Columns");
	     	col=scanner.nextInt();
	     	A[i]=new int[col];
	     }	  

	     for(int i=0;i<A.length;i++){
	     	 for(int j=0;j<A[i].length;j++){
	     	 	System.out.println("Enter Run");
	     	 	  A[i][j]=scanner.nextInt();
	     	 }
	     }

	     for(int i=0;i<A.length;i++){
	     	 for(int j=0;j<A[i].length;j++){
	     	 	  System.out.print(A[i][j] +"  ");
	     	 }
	     	 System.out.println();
	     }
	}
}