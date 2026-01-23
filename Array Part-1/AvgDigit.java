class AvgDigit{

	static int sumOfDigit(int num){
		int sum=0;
		while (num!=0) {
				sum=sum+num%10;
				num=num/10;
		}
		return sum;
	}

	static int countDigit(int num){
		int cnt=0;
		  while(num>0){
		  	cnt++;
		  	num=num/10;
		  }
		  return cnt;
	}

	public static void averageDigit(int A[]){
		for(int i=0;i<A.length;i++){
			A[i]=sumOfDigit(A[i])/countDigit(A[i]);

		}
	}
	static void display(int A[]){
		for(int ele : A)   // for each loop
			System.out.print(ele+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		
		int A[]={123,235,6754,3257,64,2367,288,35,645,374,56};
		display(A);
		averageDigit(A);
		display(A);



	}
}

