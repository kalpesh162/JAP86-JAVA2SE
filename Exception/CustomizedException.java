/*
class Throwable {
	  String message; 
	  Throwable(){}
	  Throwable(String message) { this.message=message;}
}
class Exception extends Throwable{

	Exception(String message){
	   super(message);
	}
}

class RuntimeException extends Exception{
	RuntimeException()
	RuntimeException(String message){
	   super(message);
	}
}
*/
class InvalidAgeException extends RuntimeException{

		InvalidAgeException(){ }
		InvalidAgeException(String message){
				super(message);
		 }	
}


class CustomizedException{

	public static void validAge(int age){
		    if(age>18){
		    	// vote 
		    }
		    else{
		    	//throw new InvalidAgeException();
		    	throw new InvalidAgeException("InvalidAge  "+age);
		    	// Unreachable code
		    	
		    }

	}

	public static void main(String[] args) {
		System.out.println("Start");
			validAge(14);
		System.out.println("END");
	}
}