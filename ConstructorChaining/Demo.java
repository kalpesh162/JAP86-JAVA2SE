class A{
	int z;
	A(){ 
		System.out.println("A Class Constructor");
	}
	A(int z){ 
			System.out.println("A Class Parametrized Constructor");
	}
}

class B extends A{
		int x; int y;

		B(){
			//super();
			this(11,22);
			System.out.println("B Class Constructor");
		}
		B(int x,int y){
				this.x=x; this.y=y;
				System.out.println("B Class Parametrized Constructor");
		}
}

class Demo{
	public static void main(String[] args) {
		B b1=new B();
	}
}
