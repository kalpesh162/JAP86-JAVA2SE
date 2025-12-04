class ExampleNo15{
	public static void main(String[] args) {

		int x = 8, y = 2, z = 5;
        int ans = --x + y++ * --z - x-- + ++y - z++ + x;
        System.out.println("Answer: " + ans); 
		
	}
}