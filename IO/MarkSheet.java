import java.util.Scanner;

class MarkSheet{
	
	public static void main(String[] args) {
		int subject1;
		int subject2;
		int subject3;
		int subject4;
		int subject5;

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter subject1 Marks");
		subject1=scanner.nextInt();
		System.out.println("Enter subject1 Marks");
		subject2=scanner.nextInt();
		System.out.println("Enter subject1 Marks");
		subject3=scanner.nextInt();
		System.out.println("Enter subject1 Marks");
		subject4=scanner.nextInt();
		System.out.println("Enter subject1 Marks");
		subject5=scanner.nextInt();
		

		int totalMarks=subject1+subject2+subject3+subject4+subject5;

		double avg=totalMarks/5.0;

		double percentage=(totalMarks/500.0)*100;

		System.out.println("==================================");
		System.out.println("subject1  "+subject1);
		System.out.println("subject2  "+subject2);
		System.out.println("subject3  "+subject3);
		System.out.println("subject4  "+subject4);
		System.out.println("subject5  "+subject5);
		System.out.println("________________________________");
		System.out.println("           "+totalMarks);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("AVG  "+avg);
		System.out.println("             Percentage"+ percentage);

		System.out.println("==================================");


	}
}