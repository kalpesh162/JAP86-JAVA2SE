class Color{
	static boolean is6Present(int n){
		while(n!=0){
			 if(n%10==6)return true;
			 n=n/10;	
		}
		return false;
	}

	static void replaceWithColorCode(int A[]){

		for(int i=0;i<A.length;i++){
			  int num=A[i];
			  if(num%6==0 && is6Present(num)){
			  	A[i]=-3;
			  }
			  else if(num%6==0)
			  	A[i]=-1;
			  else
			  	A[i]=-2;
		}
	}

	static void display(int A[]){
		for(int ele : A)   // for each loop
			System.out.print(ele+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		int input[]= {15,23,18,26,72,36,49,38,60,17,22,46};
		display(input);
		replaceWithColorCode(input);
		display(input);
	}
}