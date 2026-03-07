class EvenNum{

	void print(int start){
		if(start>10)
			return;

		if(start %2==0)
			System.out.println(start);
		print(start+1);
	}

	public static void main(String[] args) {
		int N=10;

	}
}