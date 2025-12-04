import java.util.Scanner;
class TriangleAngle{

 //main()  ()  parenethessis   --> Function | Method
// {}  
	// []
	public static void main(String a[]){

		double angeleA;double angeleB;double angeleC;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Angle A");
		angeleA=scanner.nextDouble();
		System.out.println("Enter Angle B");
		angeleB=scanner.nextDouble();

		angeleC=180-(angeleA+angeleB);
		System.out.println("AngleA  "+angeleA);
		System.out.println("AngleB  "+angeleB);
		System.out.println("AngleC  "+angeleC);
	}
}