class UnaryOp8{
	
	public static void main(String[] args) {
		int a = 6;
		int b = 2;
		int c = ++a + b++ - a-- + --b + a;
		System.out.println(c);
	}
}