class ExerciseNo20{
	public static void main(String[] args) {
		int a = 5, b = 2, c = 1;
        int result = ++a + b++ - c-- + a * b - --a - c + ++b;
        System.out.println("Result: " + result); 
	}
}