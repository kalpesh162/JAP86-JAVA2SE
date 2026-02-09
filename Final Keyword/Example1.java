
class Example1{
	public static void main(String[] args) {
		
		double radius=6.6;
		final double PI_VALUE=3.14;  // final
		// local variable
		System.out.println("Area "+(PI_VALUE*radius*radius));

			// error: cannot assign a value to final variable PI_VALUE
		//PI_VALUE=3.33;
	}
}