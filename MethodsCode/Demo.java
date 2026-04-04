interface Instrument{
	 void play();
}

class Guitar implements Instrument{
		// Method java/lang/Object."<init>":()V
		 // Method Guitar."<init>":()V 

	@Override
	public void play(){
		System.out.println("Guitar Plays");
	}
}

class Demo{
	public static void main(String[] args) {
			
			Instrument i1=new Guitar();  //invokeinterface #4,  1            // InterfaceMethod Instrument.play:()V
			i1.play();

	}
}

/*
class Demo {
  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #2                  // class Guitar
       3: dup
       4: invokespecial #3                  // Method Guitar."<init>":()V
       7: astore_1
       8: aload_1
       9: invokeinterface #4,  1            // InterfaceMethod Instrument.play:()V
      14: return
}
*/

/*

Compiled from "Demo.java"
class Guitar implements Instrument {
  Guitar();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public void play();
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #3                  // String Guitar Plays
       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}

*/
