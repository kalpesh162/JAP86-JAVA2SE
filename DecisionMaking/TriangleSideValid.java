/*Write a Java program to input all sides of a triangle and check whether triangle is valid or not.*/
import java.util.Scanner;

class TriangleSideValid{
	public static void main(String[] args) {
		int side1,side2,side3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Angle A");
		side1=scanner.nextInt();
		System.out.println("Enter Angle B");
		side2=scanner.nextInt();
		System.out.println("Enter Angle C");
		side3=scanner.nextInt();

		// 10  3  4
		// (side1+side2)>side3  || side2+side3>side1 || side3+side1>side2
		if((side1+side2)>side3  && (side2+side3)>side1 && (side3+side1)>side2){
			System.out.println("Valid triangle");
		}
		else{
			System.out.println("IN Valid triangle");
		}


	}
}