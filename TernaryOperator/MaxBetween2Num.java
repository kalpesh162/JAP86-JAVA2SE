import java.util.Scanner;
class MaxBetween2Num{
	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1");
		num1=scanner.nextInt();
		System.out.println("Enter Num2");
		num2=scanner.nextInt();

		//if(num1>num2){ }else { }
		int large=(num1>num2) ? num1 : num2;

		System.out.println("Max Num  "+large);
/*
		if(num1>num2){
			large=num1;
		}
		else{
			large=num2;
		}
*/
	}
}
