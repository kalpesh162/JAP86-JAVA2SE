import java.util.Scanner;
class Power{
	public static void main(String[] args) {
			int x;int y;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Number  X");
			x=scanner.nextInt();
			System.out.println("Enter Number  Y");
			y=scanner.nextInt();
			int sum=1;
			while (y>=1) {
				sum=sum*x;
				y--;
			}
			System.out.println(sum);
	}
}