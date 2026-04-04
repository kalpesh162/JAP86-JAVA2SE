class Student{
	  private int id;
	  private  static String collegeName="ABC";

	  public Student(){

	  }

	  public int getId(){ return id; }

	  public static String getCollegeName(){
	  	 return collegeName;
	  }

}

class App{
	public static void main(String[] args) {
		Student s1=new Student();  // Here Constructor Call

		s1.getId();   // instance method Call

		Student.getCollegeName(); // static method Call
	}
}