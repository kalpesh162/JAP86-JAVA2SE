/*      
    Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. 
    Calculate percentage and grade according to following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F
*/
import java.util.Scanner;
class Grade{
	
	public static void main(String[] args) {
		byte phy,chem,bio,math,comp;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Physics Marks");
		phy=scanner.nextByte();
		System.out.println("Enter Chemistry Marks");
		chem=scanner.nextByte();
		System.out.println("Enter Biology Marks");
		bio=scanner.nextByte();
		System.out.println("Enter Mathematics Marks");
		math=scanner.nextByte();
		System.out.println("Enter Computer Marks");
		comp=scanner.nextByte();

		// byte + byte
		//short = byte+ byte
		// int = byte+byte

		//int  totalMarks=phy+chem+bio+math+comp;
		short totalMarks=(short)(phy+chem+bio+math+comp);

		// Narrowing 
		// Widening

		System.out.println(totalMarks);
		// HW
	}
}