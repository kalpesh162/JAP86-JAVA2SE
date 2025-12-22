import java.util.Scanner;
class StrongNumber{
	public static void main(String[] args) {
		 int num;
		 System.out.println("Enter Num ");
		 Scanner scanner=new Scanner(System.in);
		 num=scanner.nextInt();
		 int temp=num;
		 int sum=0;
		 while(num!=0){
		 	int rem=num%10;
		 	int fact=1;
		 	for(int i=1;i<=rem;i++){
		 		fact=fact*i;
		 	}
		 	sum=sum+fact;
		 	num=num/10;
		 }
		
		if(temp==sum){
			System.out.println("Strong Number");
		}
		else
			System.out.println("NOT Strong Number");
	}
}