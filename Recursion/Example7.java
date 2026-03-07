class Example7{

	static void print(int s,int e){
		//if(s>e) return;
		if(s==e){
			if(s%2==0)
				System.out.println(s);			
			return;
		}

		print(s+1,e);
		if(s%2==0)
			System.out.println(s);

	}
	public static void main(String[] args) {
		int start=1;
		int end=10;
		print(start,end);
	}
}