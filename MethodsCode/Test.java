
interface OneParam{
	 void sayHello(String n);
}

class Test{
	public static void main(String[] args) {
		String name="Kalpesh";
		OneParam param=(name1) -> System.out.print(name1);

		OneParam param1=(name2) -> System.out.print(name2.toUpperCase());

		OneParam param2=(name3) -> System.out.print(name3.charAt(0));

	}
}

/*

Compiled from "Test.java"
class Test {
  Test();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: ldc           #2                  // String Kalpesh
       2: astore_1
       3: invokedynamic #3,  0              // InvokeDynamic #0:sayHello:()LOneParam;
       8: astore_2
       9: invokedynamic #4,  0              // InvokeDynamic #1:sayHello:()LOneParam;
      14: astore_3
      15: invokedynamic #5,  0              // InvokeDynamic #2:sayHello:()LOneParam;
      20: astore        4
      22: return
}

*/