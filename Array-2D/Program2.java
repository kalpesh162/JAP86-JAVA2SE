// Jagged Array
class Program2{
		
		static void display(int B[][]){
			   for(int i=0;i<B.length;i++){
			   	 for(int j=0;j<B[i].length;j++){
			   	 	 System.out.print(B[i][j]+"  ");
			   	 }
			   	 System.out.println();
			   }
		}

	public static void main(String[] args) {
		int B[][]={{1,2},{1,2,3},{1,2,3,4}};
		display(B);

	}
}