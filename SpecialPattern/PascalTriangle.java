/*
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
 */
class PascalTriangle{
	public static void main(String[] args) {
		
		int num=4;


		for(int n=0;n<=num;n++){
				for(int sp=n;sp<=num;sp++)
					System.out.print(" ");

			 for(int k=0;k<=n;k++){
			 	
			 	int term=fact(n)/(fact(k)*fact(n-k));

			    //System.out.print(term+"   ");
			    System.out.printf("%4d",term);
			 }
			 System.out.println();
		}

	}


	public static int fact(int num){
		 int res=1;
		 for(int i=1;i<=num;i++)
		 	res=res*i;
		 return res;
	}
}