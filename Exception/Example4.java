class Example4{
	public static void main(String[] args) {
		
		System.out.println("Hello");

		//throw new ArithmeticException("/ by zero");
		// unreachable statement  // Compile Time Error
		try{
				throw new ArithmeticException("/ by zero");
			}catch(Exception e){
				System.out.println(e);
			}
		System.out.println("Bye..");

	}
}