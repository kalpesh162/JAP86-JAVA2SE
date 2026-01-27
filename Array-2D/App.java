class Student{
	private int id;
	private String name;
	private double marks[]=new double[5];

	Student(int id,String name){
		this.id=id; this.name=name;
	}
	Student(String name){
		 this.name=name;
	}
	public void setId(int id){this.id=id;}
	public int getId(){ return id;}

	public void setName(String name){ this.name=name;}
	public String getName(){ return name;}

	public double[] getMarks(){
		 return this.marks;
	}

	public void setMarks(double language,double phy,double chem,double bio,double math){
		marks[0]=language;
		marks[1]=phy;
		marks[2]=chem;
		marks[3]=bio;
		marks[4]=math;
	}

	public void displayStudent(){
		System.out.println("Id  "+id);
		System.out.println("Name "+name);

		for(int i=0;i<marks.length;i++){
			System.out.print(" "+marks[i]);
		}
		System.out.println();
	}
}

class App{
	public static void main(String[] args) {

		Student s1=new Student(11,"Rahul");

		s1.setMarks(44,55,66,77,88);

		s1.displayStudent();
		
	}
}