// E:\JAP-86-WorkSpace\SampleProgram\Input.java

// C:\Program Files\Java\jdk1.8.0_241\jre\lib/rt.jar
import java.lang.*;
import java.util.Scanner;

class Input{
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		Scanner scanner=new Scanner(System.in);
		
		int num1; int num2;int num3;
	
		System.out.println("Enter Num1");
		num1=scanner.nextInt();
		System.out.println("Enter Num2");
		num2=scanner.nextInt();
		System.out.println("Enter Num3");
		num3=scanner.nextInt();


		if(num1>num2 && num1>num3){
			System.out.println("Num1 is Large  "+num1);
		}		
		else{

             if(num2>num3){
            	System.out.println("Num2 is Large  "+num2); 	
             }
             else{
             	System.out.println("Num3 is Large  "+num3);
             }
			
		}

	}
}