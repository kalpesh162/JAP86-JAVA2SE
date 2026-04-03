package basic4;

import java.util.function.Consumer;
// Print ASCII value of each character in a string.
public class PrintAscii {
	
	public static void main(String[] args) {
		String name="Kareena";
		
		Consumer<String>print=(n) -> {
			  for(int i=0;i<n.length();i++)
				  System.out.print(n.charAt(i) +"  "+ (int)n.charAt(i) +"  ");
		};
	

		print.accept(name);
	
	
	}
}
