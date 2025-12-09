/*Write a Java program to print all even numbers between 1 to 100. - using while loop*/
class  EvenNumbers{
	public static void main(String[] args) {
		
		int start=1;

		while(start<=100){
			if(start%2==0){
				System.out.print(start+" ");
			}
			start++;  // start+=1;  start+=5
		}

	}
}
