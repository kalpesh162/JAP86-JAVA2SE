import java.util.Scanner;
class LargestAmon2{

	public static void main(String[] args) {

		int num1;int num2;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1 ");
		num1=scanner.nextInt();
		System.out.println("Enter Num2 ");
		num2=scanner.nextInt();

	// num1>num2   --> num1
	// num2>num1   --> num2
    // num1==num2  -->
		if(num1>num2){
			System.out.println("Num1 is Greater  "+num1);
		}
		else{
              if(num1==num2){
              	System.out.println("Both Numbers Are Equal");	
              }
              else{
              	System.out.println("Num2 is Greater  "+num2);
              }
		}

		
	}

}