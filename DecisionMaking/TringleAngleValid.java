/*Write a Java program to input angles of a triangle and check whether triangle is valid or not.*/
import java.util.Scanner;
class TringleAngleValid{
	
	public static void main(String[] args) {
		int angleA,angleB,angleC;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Angle A");
		angleA=scanner.nextInt();
		System.out.println("Enter Angle B");
		angleB=scanner.nextInt();
		System.out.println("Enter Angle C");
		angleC=scanner.nextInt();

		if((angleA+angleB+angleC)==180){
			System.out.println("Valid triangle");
		}
		else{
			System.out.println("In Valid triangle");
		}

	}
}


    