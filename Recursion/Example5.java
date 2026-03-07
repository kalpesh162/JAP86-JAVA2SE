// Example Print 1 to 5
class Example5{
	static void print(int start){
		if(start==6)
			return;

		System.out.println(start);
		print(start+1);
		//System.out.println(start);  5 4 3 2 1
	}

	public static void main(String[] args) {
			print(1);
	}
}

/*
1
2
3
4
5
*/