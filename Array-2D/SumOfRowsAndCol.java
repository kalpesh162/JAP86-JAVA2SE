class SumOfRowsAndCol{

	static void printRowAndColumnSum(int A[][]){
		int rowsSum=0; int colSum=0;

		for(int i=0;i<A.length;i++){
			rowsSum=0;colSum=0;
			for(int j=0;j<A[i].length;j++){
                   rowsSum+=A[i][j];
                   colSum+=A[j][i];
			}
			System.out.println(" ROW  "+rowsSum);
			System.out.println(" COL  "+colSum);
		}
	}
	 public static void main(String[] args) {

	 	int A[][]={{1,2,3},{4,5,6},{7,8,9}};

	 	printRowAndColumnSum(A);

	 }
}