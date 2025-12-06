import java.util.Scanner;
class MaxBetween3Num{
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1");
		num1=scanner.nextInt();
		System.out.println("Enter Num2");
		num2=scanner.nextInt();
		System.out.println("Enter Num3");
		num3=scanner.nextInt();

	}
}

/*
if(num1>num2 && num1>num3)
   num1
else if(num2>num3)
  num2
 else
  num3

*/