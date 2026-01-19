import java.util.Scanner;
class Program4{

	static void display(int A[]){
		for(int i=0;i<A.length;i++){
			System.out.print(A[i] +"  ");
		}

	}

	static int[] intializeArray(int size){
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[size];
	
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter Element");
			arr[i]=scanner.nextInt();
		}
		return  arr;
	}

	public static void main(String[] args) {

		int size;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter Size");
		size=scanner.nextInt();
		
		int A[]=intializeArray(size);
		display(A);  

	}
}