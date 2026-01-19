import java.util.Scanner;
class Program3{
	static void display(int A[]){
		for(int i=0;i<A.length;i++){
			System.out.print(A[i] +"  ");
		}
	}
	public static void main(String[] args) {
		int size;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter Size");
		size=scanner.nextInt();
		// Array Create
		int arr[]=new int[size];
		// arr is a 1-D Array which has size(5) elements are of type int
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter Element");
			arr[i]=scanner.nextInt();
		}
		display(arr);  
	}
}