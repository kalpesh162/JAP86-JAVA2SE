import java.util.Scanner;
class PerfectNumber{
	public static void main(String[] args) {
		 int num;
		 System.out.println("Enter Num ");
		 Scanner scanner=new Scanner(System.in);
		 num=scanner.nextInt();
		 
		  int sum=0;

		 for(int i=1;i<num;++i){
		 	if(num%i==0)
		 		sum=sum+i;
		 }

		 if(sum==num){
		 	System.out.println("Perfect Num");
		 }else
		 System.out.println("NOT Perfect Num");

		}

	}