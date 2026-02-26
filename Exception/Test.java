import java.io.File;
import java.io.IOException;

class Test{
	public static void main(String[] args) {
			//
			File file=new File("ABC.txt");  //  E:/Java-WorlSpace/Exception
											// ABC.txt
			// Relative Path

			//File file=new File("D:/New/ABC.txt");
			// Absolute Path
 
 //  unreported exception IOException; must be caught or declared to be thrown
			 try{
			file.createNewFile();
		}
		catch(IOException e){

			System.out.println(e);
		}

		System.out.println("*******");

		try{
		Thread.sleep(500);
	}catch(InterruptedException e){
		 		System.out.println(e);
	}

		System.out.println("*******");

	}
}