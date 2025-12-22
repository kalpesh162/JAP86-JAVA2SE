import java.util.Scanner;
class PerfectCube{
	public static void main(String[] args) {
		 int num;
		 System.out.println("Enter Num ");
		 Scanner scanner=new Scanner(System.in);
		 num=scanner.nextInt();

		 int root=(int)Math.cbrt(num);

		 if(root*root*root==num){
		 	System.out.println("Perfect Cube Root");
		 }
		 else{
		 	System.out.println("Not Perfect Cube Root");
		 }
		 
	}
}
