/*Write a Java program to check whether the triangle is equilateral, isosceles or scalene triangle.*/
import java.util.Scanner;

class TriangleTypeValid{
	public static void main(String[] args) {
		int side1,side2,side3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Angle A");
		side1=scanner.nextInt();
		System.out.println("Enter Angle B");
		side2=scanner.nextInt();
		System.out.println("Enter Angle C");
		side3=scanner.nextInt();

		// a==b  b==c   --> a b c are equal
		if((side1==side2 && side2==side3){
			System.out.println("equilateral triangle");
		}
		else if(side1==side2 || side2==side3 || side1=side3){
			System.out.println("isosceles triangle");	
		}
		else{
			System.out.println("scalene triangle");		
		}

	}
}