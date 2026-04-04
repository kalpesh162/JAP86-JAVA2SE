
interface OneParam{
	 void sayHello(String n);
}

class Blast{
	public static void main(String[] args) {
			
			String name="Kalpesh";
			//Blast$1.class
			OneParam p1=new OneParam(){
				public void sayHello(String n){
					System.out.println(n);
				}
			};

			//Blast$2.class
			OneParam p2=new OneParam(){
				public void sayHello(String n){
					System.out.println(n.toUpperCase());
				}
			};

			//Blast$3.class
			OneParam p3=new OneParam(){
				public void sayHello(String n){
					System.out.println(n.charAt(0));
				}
			};

		
	}
}

/*

Compiled from "Blast.java"
class Blast {
  Blast();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: ldc           #2                  // String Kalpesh
       2: astore_1
       3: new           #3                  // class Blast$1
       6: dup
       7: invokespecial #4                  // Method Blast$1."<init>":()V
      10: astore_2
      11: new           #5                  // class Blast$2
      14: dup
      15: invokespecial #6                  // Method Blast$2."<init>":()V
      18: astore_3
      19: new           #7                  // class Blast$3
      22: dup
      23: invokespecial #8                  // Method Blast$3."<init>":()V
      26: astore        4
      28: return
}

*/