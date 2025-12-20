import java.util.Scanner;
	class PrimeNumberChecker{
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number To Check Prime!!");
		num=scanner.nextInt();	
		boolean flag=true;
		if(num==0 || num==1)
			flag=false;
		// V1 for(int i=2;i<num;i++)    7720
		// V2 for(int i=2;i<num;i++)    3860 
		//   Math.sqrt(num)         65
		// V3 // V2 for(int i=2;i<Math.sqrt(num);i++)
		for(int i=2;i<Math.sqrt(num);i++){
			  if(num%i==0){
			  	flag=false;
			  	break;
			  }
		}
		if(flag==true)
			System.out.println("Prime ");
		else
			System.out.println("NOT Prime ");
	}
}