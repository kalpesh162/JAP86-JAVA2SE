import java.util.Scanner;
class PerfectSquare{
	public static void main(String[] args) {
		 int num;
		 System.out.println("Enter Num ");
		 Scanner scanner=new Scanner(System.in);
		 num=scanner.nextInt();

		 long value=11;
		 // Widening
		 //  long<---int
		 //  long<---(long)int
		
		 int root=(int)(Math.sqrt(num));

		 if(root*root==num){
 			System.out.println("PerfectSquare ");
		 }
		 else{
		 	 	System.out.println("NOT  PerfectSquare ");
		 }

/*

		 boolean flag=false;
		 for(int i=root ;i>=1;i--){
		 	 if(i*i==num){
		 	 	flag=true;
		 	 	System.out.println("PerfectSquare ");
		 	 	break;
		 	 }
		 }
		 if(flag==false)
		 	System.out.println("NOT PerfectSquare ");

*/

		}
	}
		 