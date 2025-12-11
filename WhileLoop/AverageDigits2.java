import java.util.Scanner;
class AverageDigits2{
	public static void main(String[] args) {
		int num;int digitCount=0;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();

		while (num!=0) {
			sum+=num%10;
			num=num/10;
			digitCount++;
		}

		double avg=sum/(digitCount*1.0);
		System.out.println(avg);

	}
}