package p2;

public class App {
	
	public static void main(String[] args) {
		
		
		int arr[][]= {{11,22,33},{44,55,66},{77,88,99}};
		printArray(arr);
		
	}

	private static void printArray(int[][] arr) {
		int n=arr.length; int m=arr[0].length;
		for(int i=0;i<n;i++) {   // n times
			 for(int j=0;j<m;j++)   // m times
				 System.out.print(arr[i][j] +"  ");
			 System.out.println();
		}
		// n*m     m=n  n*n  n2   Quadratic Growth
		// logn    logarithmic 
		// n       Linear Growth
		
	}

}
