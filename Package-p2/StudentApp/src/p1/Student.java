package  p1;

public class Student{
		private int id;
		private  String name;
		private double marks;
		private static String institute;
		static{
			institute="VibrantMinds";
		}

		public Student(int id,String name,double marks){
			this.id=id; this.name=name; this.marks=marks;
		}

/*		
		Student(int id,String name,double marks,String institute){
			this.id=id; this.name=name; this.marks=marks;
			//this.institute=institute;
		}
*/
		public void setId(int id){
			this.id=id;
		}

		public void setName(String name){
			this.name=name;
		}

		public void setMarks(double marks){
			this.marks=marks;
		}

		public int getId(){ return id;}
		public String getName(){ return name;}
		public double getMarks() { return marks;}

		public void displayStudent(){
			System.out.println("ID  "+id);
			System.out.println("Name  "+name);
			System.out.println("marks  "+marks);
			System.out.println("institute "+institute);
			System.out.println("-----------------------");
		}

		public static void setInstitute(String instName){
			institute=instName;
		}

		public static String getInstituteName(){ return institute; }

}