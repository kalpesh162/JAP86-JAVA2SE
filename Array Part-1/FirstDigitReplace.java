/*
WAP to replace each elements with their first digit of element
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
Output:{1,2,6,3,6,2,2,3,6,3}

Alternate Solution

public static void replaceFirstDigits(int A[]){
		for(int i=0;i<A.length;i++){
			int num1=A[i];
			while(num1>9)
				num1=num1/10;
			
			A[i]=num1;
		
		}


*/
class FirstDigitReplace{
	public static void display(int A[]){
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+ "  ");

		System.out.println();
	}

	static int countDigit(int num){ 
		int cnt=0;
		while (num!=0) {
			cnt++; num=num/10;
		}
		return cnt;
	}
	static int divider(int cnt){
		int multipler=1;
		while (cnt>1) {
			multipler=multipler*10;
			cnt--;
		}
		return multipler;
	}
	public static void replaceFirstDigits(int A[]){
		for(int i=0;i<A.length;i++){
			int cnt=countDigit(A[i]);
			int multipler=divider(cnt);
			//System.out.println(multipler);
			 //A[i]=A[i]/divider(countDigit(A[i]));
			A[i]=A[i]/multipler;
		}

	}
	public static void main(String[] args) {

		int A[]={123,235,6754,3257,64,2367,288,35,645,374};
		display(A);
		replaceFirstDigits(A);
		display(A);

		
	}
}