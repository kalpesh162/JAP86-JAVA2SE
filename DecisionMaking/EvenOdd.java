import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args) {
			int num;
		System.out.println("Enter Num ");
		Scanner scanner=new Scanner(System.in);

		num=scanner.nextInt();

		 // num%2==0
		 // num%2==1  OR num%2!=0
		if (num%2==0) {
			System.out.println("Number is Even");
		}
		else{
			System.out.println("Number is Odd");
		}

		// if(){  } else{ }
		/*
		if(){

		}
		//...
		else{

		}
		*/


	}
}