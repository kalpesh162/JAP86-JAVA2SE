import java.util.Scanner;
class LargestAmong3{
	public static void main(String[] args) {
		int num1;int num2;int num3;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1 ");
		num1=scanner.nextInt();
		System.out.println("Enter Num2 ");
		num2=scanner.nextInt();
		System.out.println("Enter Num3 ");
		num3=scanner.nextInt();

		if(num1>num2){
			  if(num1>num3){
			  	System.out.println("Greater is a"+num1);
			  }
			  else{
			  	System.out.println("Greater is c"+num3);
			  }
		}
		else{
				if(num2>num3){
					System.out.println("Greater is b"+num2);
				}else{
					System.out.println("Greater is c"+num3);
				}
		}
	}
}