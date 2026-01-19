import java.util.Scanner;
class Program2{
	public static void main(String[] args) {
		int size;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter Size");
		size=scanner.nextInt();
		// Array Create
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			System.out.print("Enter Element");
			arr[i]=scanner.nextInt();
		}

		for(int i=0;i<arr.length;i++)
			System.out.println("arr [ "+i+ "] --- "+arr[i]);

	}
}