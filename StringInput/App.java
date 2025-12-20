import java.util.Scanner;
class App{
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Name");
		//String name=scanner.next();
		String name=scanner.nextLine();
		System.out.println(name);

// case lable must be constant
		// lable  INTEGER CONSTANT   CHARCTER CONSTANT  String CONSTANT
		switch(name){
			  case "Sachin" : System.out.println("Cricketer");
			  break;
			  case "Kareena" : System.out.println("Actor");
			  break;

		}
	}
}