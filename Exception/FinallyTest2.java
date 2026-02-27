// finally Block importance
//  Create file Here
// Write into that file
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.*;

class FinallyTest2{
	public static void main(String[] args) {
			File file=null;
			FileWriter fw=null;
			try{
			 file=new File("name.txt");
			 fw=new FileWriter(file);
			fw.write("Apple");
			fw.write("\n");
			fw.write(100);  // d
			fw.write("\n");
			char arr[]={'M','A','N','G','O'};
			fw.write(arr);
			fw.write("\n");

			fw.flush();  // gurantess all contetnt will write to the file
			}catch(IOException e){

			}
			finally{
				try{
				fw.close();
			}catch(IOException e ){ }
		}





	}
}