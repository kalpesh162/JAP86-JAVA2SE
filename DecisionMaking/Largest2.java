import java.util.Scanner;
class Largest2{
	public static void main(String[] args) {
		int num1;int num2;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1 ");
		num1=scanner.nextInt();
		System.out.println("Enter Num2 ");
		num2=scanner.nextInt();

			//num1>num2  ==> num1
			// num2>num1  ==> num2

		if(num1>num2){
			System.out.println("num1 is Large" + num1);
		}
		
		if(num2>num1){
			System.out.println("num2 is Large" + num2);
		}

			
 	}
}