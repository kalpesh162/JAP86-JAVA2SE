class Student{
	// INSTANCE FIELDS  MEMBER FIELDS
	int id;
	String name;
	int marks;


  // INSTANCE FUNCTION MEMBER FUNCTION
	void displayStudent(){
		System.out.println("ID  "+id);
		System.out.println("NAME  "+name);
		System.out.println("MARKS  "+marks);
	}

	int getMarks(){
		return marks;
	}
}


class App{
	public static void main(String[] args) {
		
			Student s1=new Student();
			// s1 is pointer(reference )
			// new Student()   an Object
			s1.displayStudent();

			s1.id=10;
			s1.name="Sachin";
			s1.marks=99;

			s1.displayStudent();

			System.out.println(s1.getMarks());


	}
}