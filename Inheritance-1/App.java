
// MultiLevel Inheritance
class Animal{ // Parent Super(Java) Base(CPP|C#)
	public int x=10;

	public void eat(){
		System.out.println("Eating..");
	}
}
 // :  :
// Generalization to Specialization
// Child  Sub   Derived
class Dog extends Animal{
		public int y=11;

		public void bark(){
			System.out.println("bark ...");
		}
}

class BabyDog extends Dog{
	public int z=12;
	
	public void weep(){
			System.out.println("weep ...");
		}
}

class App{
	public static void main(String[] args) {
		Dog d1=new Dog();	
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.eat();
		d1.bark();

		Animal animal=new Animal();
	}
}