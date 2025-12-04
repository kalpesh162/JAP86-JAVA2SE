import java.util.Scanner;
class Input{
	
	public static void main(String[] args) {
		int num;

		System.out.println("Enter Num");
		Scanner scanner=new Scanner(System.in);

		num=scanner.nextInt();
		// num>0

		if(num>0){
		System.out.println("Num is "+num);	
		}

		
	}

}