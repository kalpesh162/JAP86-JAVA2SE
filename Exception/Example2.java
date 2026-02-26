import java.io.File;
import java.io.IOException;
import java.io.FileReader;
class Example2{
	public static void f1() throws IOException,InterruptedException{
		System.out.println("f1");
			f2();
		System.out.println("f1 END");
	}
	public static void f2() throws IOException,InterruptedException{
		System.out.println("f2");
			f3();	
		System.out.println("f2 END");
	}
	// we can throws multiple Exception at a time

	public static void f3() throws IOException,InterruptedException{
		
		File file=new File("E:/C-WorkSpace-DEC-2024/BASICS/sample1.c");
		FileReader fr=new FileReader(file);
		// int fr.read()  // int ---> char   one    // -1 END OF FILE  (EOF)
		int val=fr.read();
		while(val !=-1 ){
			System.out.print((char)val);
			val=fr.read();
		}
		fr.close();
	}
	public static void main(String[] args) throws IOException,InterruptedException {
		System.out.println("Main");
		f1();
		System.out.println("Main END");
	}
}
