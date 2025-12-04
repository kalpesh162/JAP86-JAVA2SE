import java.util.Scanner;
class CircleOperation{


		public static void main(String[] args) {
			double radius;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Radius");
			radius=scanner.nextDouble();

			double diameter=radius*2;

			double perimeter=2*3.14*radius;

			double area=3.14*radius*radius;

			System.out.println("radius               "+radius);
			System.out.println("diameter             "+diameter);
			System.out.println("Perimeter Of Circle  "+perimeter);
			System.out.println("Area Of Circle       "+area);

		}


}