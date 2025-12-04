import java.util.Scanner;
class PosNeg{
	public static void main(String[] args) {
		int num;
		System.out.println("Enter Num ");
		Scanner scanner=new Scanner(System.in);

		num=scanner.nextInt();

		if(num>0){
			System.out.println("No Is +ve  "+ num);
		}
		
		if(num<0){
			System.out.println("No Is -ve  "+ num);
		}

		if(num==0){
			System.out.println("No Is 0  "+ num);	
		}

	}
}