class ExerciseNo16{
	
	 public static void main(String[] args) {
        int a = 4, b = 6, c = 3;
        int result = a++ + b-- - --c + ++a * c++ - b + a;
        System.out.println("Result: " + result); 
    }
}