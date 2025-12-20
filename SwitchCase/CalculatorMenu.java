import java.util.Scanner;
class CalculatorMenu{
	 public static void main(String[] args) {
	 	int num1,num2,res;
	 	char yesOrNo;
	 	char symbol;
	 
	 do{
	 	Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num1");
		num1=scanner.nextInt();
		System.out.println("Enter num2");
		num2=scanner.nextInt();

		System.out.println("***** OPERATION *******");
		System.out.println("           +");
		System.out.println("           -");
		System.out.println("           *");
		System.out.println("           /");
		System.out.println("           %");
		System.out.println("##########################");
		System.out.println("Enter Symbol  ");

		symbol=scanner.next().charAt(0);

		switch (symbol) {

			case '+'  :  res=num1+num2;
			            System.out.println("Add  "+res);
			            break;
			case '-'  :  res=num1-num2;
			            System.out.println("SUB  "+res);
			            break; 
			case '*'  :  res=num1*num2;
			            System.out.println("MUL  "+res);
			            break;
			case '/'  :  res=num1/num2;
			            System.out.println("DIV  "+res);
			            break;
			case '%'  :  res=num1%num2;
			            System.out.println("MODULUS  "+res);
			            break; 

			default  : System.out.println("Not Valid Operation");
		}

		System.out.println("To Continue Press -> Y   Exit -> N");
		yesOrNo=scanner.next().charAt(0);

	}while(yesOrNo=='Y' || yesOrNo=='y');

	System.out.println("Thank YOU !!!!");
	 	
	 }
}
