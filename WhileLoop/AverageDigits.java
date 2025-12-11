import java.util.Scanner;
class AverageDigits{

	public static void main(String[] args) {
		int num;int digitCount=0;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		int temp=num;
		// Counting Digits
		while(num!=0){
			num=num/10;
			digitCount++;
		}
		// Sum Of Digits
		while (temp!=0) {
			sum=sum+temp%10;
			temp=temp/10;
		}
		double avg=sum/(digitCount*1.0);

		System.out.println(avg);

	}

}