import java.util.Scanner;
class Day{
	public static void main(String[] args) {
			
			int num;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Day No  [1 - 7]");
			num=scanner.nextInt();
			int x=3;  // x is a varaible
			switch(num){
				// case 1 :
				// case keyword
				// 1 CONSTANT
				// :  No Need Of cases order [ASC  DESC]
				// Case Must be CONSTANT
				// 
					//case x+2 : System.out.println("THRDAY");
								/*
										constant expression required
                                        case x+2 : System.out.println("THRDAY");*/
                    case 3+2 : System.out.println("THRDAY");
							break;
					case 6 : System.out.println("FRIDAY");
							break;
					case 7 : System.out.println("SATDAY");
							break;

					case 1 : System.out.println("SUNDAY"); 
							break;
					case 2 : System.out.println("MONDAY");
							break;
					case 3 : System.out.println("TUEDAY");
							break;


					default : System.out.println("Its Not A Valid Day");
					break;

					case 4 : System.out.println("WEDDAY");
							break;
//: duplicate case label
							/*
					case 2+2 : System.out.println("WEDDAY");
							break;
					*/
					// possible lossy conversion from double to int
				//	case 10.10 :  System.out.println("Decimal "); break;

				  case 'A' :System.out.println("A Letter "); break;
					// We can give case Label as Character Constant 
				  // We can not give case Label as decimal CONSTANT

			}


			// 


	}
}