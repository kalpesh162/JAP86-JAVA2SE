package p2;

import p1.Student;

public class App {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// 1 : new 
		Student s1=new Student();
		
		// bin --> p1--> Student.class
		// Step 1:
		
		Class c1=Class.forName("p1.Student");
		// T newInstance() ;  InstantiationException, IllegalAccessException
		Student student=(Student)c1.newInstance();
		
		System.out.println(student);
	}

}
