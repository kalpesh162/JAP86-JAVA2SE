class Example5{
	public static void main(String[] args) {
		
		Thread t1=new Thread();  // java.lang.Thread()
		t1.setPriority(15);  //  java.lang.IllegalArgumentException
	}
}
/*
public class java.lang.Thread{
	   Thread();
	   // 1 to 10
	   void setPriority(int n){
	   		if(n>=1 && n<=10){

	   		}
	   		throw new IllegalAccessException();
	   }
}

Student(id , name, age)
setAge(int age)

void setAge(int age){
	   if(age>0 && age<150){
	
	   }
	   throw new IllegalArgumentException();
}
*/

