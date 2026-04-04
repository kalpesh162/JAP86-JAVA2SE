class Student{
	  private int id;
	  private  static String collegeName="ABC";

	  public Student(){   //invokespecial #3                  // Method Student."<init>":()V

	  	// super();    1: invokespecial #1                  // Method java/lang/Object."<init>":()V
	  }

	  public int getId(){ return id; }

	  public static String getCollegeName(){
	  	 return collegeName;
	  }

}

class App{
	public static void main(String[] args) {
		Student s1=new Student();  // Here Constructor Call //invokespecial #3                  // Method Student."<init>":()V

		s1.getId();   // instance method Call invokevirtual

		Student.getCollegeName(); // static method Call  invokestatic
	}
}

/*
Compiled from "App.java"
class App {
  App();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #2                  // class Student
       3: dup
       4: invokespecial #3                  // Method Student."<init>":()V
       7: astore_1
       8: aload_1
       9: invokevirtual #4                  // Method Student.getId:()I
      12: pop
      13: invokestatic  #5                  // Method Student.getCollegeName:()Ljava/lang/String;
      16: pop
      17: return
}

E:\JAP-86-WorkSpace\MethodsCode>javac App.java

E:\JAP-86-WorkSpace\MethodsCode>javap -c App.class
Compiled from "App.java"
class App {
  App();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #2                  // class Student
       3: dup
       4: invokespecial #3                  // Method Student."<init>":()V
       7: astore_1
       8: aload_1
       9: invokevirtual #4                  // Method Student.getId:()I
      12: pop
      13: invokestatic  #5                  // Method Student.getCollegeName:()Ljava/lang/String;
      16: pop
      17: return
}
*/