class Program1{
	public static void main(String[] args) {
		
		int A[]={11,22,33,44,55};  // ArrayIndexOutOfBoundException
		int num1=11;
		int num2=44;

		String s1=null;

		try{
		
		System.out.println(A[num2/num1]);  // new ArithmeticException("/ by zero");
		// new ArrayIndexOutOfBoundsException(index)

		System.out.println(s1.length());

	}
	catch(RuntimeException e){
		System.out.println(e);
	}
	catch (ArithmeticException e) {
		System.out.println("ArithmeticException" +e);

	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException"+e);		
	}

	// If we write multi catch hierachy should be chhild to pare
	// Child To Parent

/*
Program1.java:21: error: exception ArithmeticException has already been caught
        catch (ArithmeticException e) {
        ^
Program1.java:24: error: exception ArrayIndexOutOfBoundsException has already been caught
        }catch (ArrayIndexOutOfBoundsException e) {
         ^
      */

	// 

	System.out.println("*** END *****");


	}
}