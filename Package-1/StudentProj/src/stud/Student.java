package stud;

public class Student{
	// INSTANCE FIELDS  MEMBER FIELDS
	private int id;
	private String name;
	private int marks;

	public Student(){ 
      id=10;
      name="";
      marks=1;
	}

	public Student(int id,String name,int marks){
		this.id=id; this.name=name; this.marks=marks;
	}

  // INSTANCE FUNCTION MEMBER FUNCTION
	public void displayStudent(){
		System.out.println("ID  "+id);
		System.out.println("NAME  "+name);
		System.out.println("MARKS  "+marks);
	}

	public void setMarks(int marks){ this.marks=marks; }
	public int getMarks(){return marks;}
	public void setName(String name){ this.name=name;}
	public String getName(){ return name;}
	public void setId(int id){ this.id=id; }
	public int getId() { return id;}
}
