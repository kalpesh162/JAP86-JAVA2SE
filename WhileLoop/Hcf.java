import java.util.Scanner;
class Hcf{
	public static void main(String[] args) {
		int num1,num2;
		int res=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number1!!");
		num1=scanner.nextInt();	
		System.out.println("Enter Number2!!");
		num2=scanner.nextInt();	

		int small = (num1<num2) ? num1 :num2;

			for(int i=1;i<=small;i++){
				if(num1%i==0 && num2%i==0)
					res=i;
			}

			System.out.println("HCF  "+res );

			//int lcm=(num1*num2)/res;
 	}
}