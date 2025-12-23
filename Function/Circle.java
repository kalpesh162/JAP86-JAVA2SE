
class Circle{

	static double getDiameter(double radius){
		return 2*radius;
	}

	static double getCircumference(double radius){
		return 2*3.14*radius;
	}

	static double getAreaOfCircle(double radius){
		 return 3.14*radius*radius;
	}


	public static void main(String[] args) {
			
			double radius=4.5;

			double diameter=getDiameter(radius);
			System.out.println(diameter);

			// HW

	}
}