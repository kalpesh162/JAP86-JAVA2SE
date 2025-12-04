import java.util.Scanner;
class DataTypeInput{

	public static void main(String a[]){
			boolean isLight;
			byte age;
			short birthYear;
			int pincode;
			long rollNo;
			float pi;
			double salary;
			Scanner scanner=new Scanner(System.in);

			System.out.println("Is A Light ON ?");
			isLight=scanner.nextBoolean();
			System.out.println("Enter Age ");
			age=scanner.nextByte();
			System.out.println("Enter birthYear ");
			birthYear=scanner.nextShort();
			System.out.println("Enter PinCode");
			pincode=scanner.nextInt();
			System.out.println("Enter Roll NO");
			rollNo=scanner.nextLong();
			System.out.println("Enter PI VALUE ");
			pi=scanner.nextFloat();
			System.out.println("Enter Salary");
			salary=scanner.nextDouble();

			System.out.println("------------------------------");
			System.out.println("Light      "+isLight);
			System.out.println("Age        "+age);
			System.out.println("BirthYear  "+birthYear);	
			System.out.println("Pincode    "+pincode);
			System.out.println("RollNO     "+rollNo);
			System.out.println("PI         "+pi);
			System.out.println("SALARY     "+salary);
			System.out.println("------------------------------");
			








	}
}