class Program1{
	public static void main(String[] args) {
		
		int N=5;
		for(int l=1;l<=N;l++){

		for(int k=1;k<=N;k++){

		for(int i=1;i<=N;i++){

		for(int j=1;j<=N;j++){
			if(l%2!=0 && i%2==0 || l%2==0 && i%2==1)
			System.out.print(" ");
			else
			System.out.print("*");
		}
		System.out.print(" ");
		}
		
		System.out.println();
	}	
		System.out.println();
	}

	}
}