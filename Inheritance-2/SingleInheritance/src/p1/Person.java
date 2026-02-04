package  p1;

public class Person{
	 private int age;
	 private String name;

	 public Person(int age,String name){
	 	this.age=age;
	 	this.name=name;
	 }

	 public void setAge(int age){ this.age=age;}
	 public void setName(String name){ this.name=name;}
	 public int getAge(){ return age;}
	 public String getName(){ return name;}

	 public void displayPerson(){
	 	  System.out.println("Id  "+age);
	 	  System.out.println("Name  "+name);
	 }
}