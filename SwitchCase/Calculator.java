import java.util.Scanner;

class Calculator{

	public static void main(String[] args) {
			int num1,num2,res;
			char symbol;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter NUm1");
			num1=scanner.nextInt();
			System.out.println("Enter NUm2");
			num2=scanner.nextInt();
			System.out.println("*****OPERATIONS **********");
			System.out.println("          +                ");
			System.out.println("          -");
			System.out.println("          *");
			System.out.println("          /");
			System.out.println("**************************");
			symbol=scanner.next().charAt(0);

			switch (symbol) {
				
				    case '+'  : res=num1+num2;
				    	System.out.println(res); break;
				    case '-'  :res=num1-num2;
				    	System.out.println(res);break;
				    case '*'  :res=num1*num2;
				    	System.out.println(res);break;
				    case '/'  :res=num1/num2;
				    	System.out.println(res);break;

				     default : System.out.println("Enter ONLY + -  * /");
				     break;
			}


	}
}