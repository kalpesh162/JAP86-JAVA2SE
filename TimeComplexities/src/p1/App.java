package p1;

public class App {
	
	public static void printBinaryNum(int n) {
		while(n>0) {
			 System.out.print(n%2+"  ");
			 n=n/2;
		}
		
	}
	
	public static void main(String[] args) {
		printBinaryNum(9);
	}

}
