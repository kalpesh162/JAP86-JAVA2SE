import java.util.Scanner;
class ArmStrongNumber{
	public static void main(String[] args) {
		 int num;
		 System.out.println("Enter Num ");
		 Scanner scanner=new Scanner(System.in);
		 num=scanner.nextInt();
		 int temp=num;
		 int power=0;
		 // Counting Digits Consider Power
		 while(temp>0){
		 	temp=temp/10;
		 	power++;
		 }
		 int res=0;
		 int y=power;
		 temp=num;
		 // 
		 while(temp!=0){

		 	int x=temp%10;     //153%10  -->  rem=3
		 	int sum=1;
		 	y=power;
		 	// Creating Power of every individual digits
		 		while (y>=1) {
		 			sum=sum*x;
		 			y--;
		 		}
		 	res=res+sum;
		 	temp=temp/10;
		 }

		 if(res==num){
		 	System.out.println("ArmStrongNumber ");
		 }
		 else{
		 	System.out.println(" NOT ArmStrongNumber ");
		 }



	}
}