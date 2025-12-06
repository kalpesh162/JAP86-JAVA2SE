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

		

		double percentage=(totalMarks/500.0)*100;

		if(percentage>=90){
				System.out.println(" Grade A");
		}
		else if(percentage>=80){
			System.out.println(" Grade B");	
		}
		else if(percentage>=70){
			System.out.println(" Grade C");	
		}
		else if(percentage>=60){
			System.out.println(" Grade D");	
		}
		else if(percentage>=40){
			System.out.println(" Grade F");	
		}
		else{
			System.out.println("FAIL  F");
		}

		System.out.println("Marks Details :  ");
		System.out.println("Physics       "+phy);
		System.out.println("Chemistry     "+chem);
		System.out.println("Biology       "+bio);
		System.out.println("Mathematics   "+math);
		System.out.println("Computer      "+comp);
		System.out.println("____________________________________________");
		System.out.println("Total Marks : "+totalMarks);
		System.out.println("Percentage :  "+percentage);



		// HW
	}
}