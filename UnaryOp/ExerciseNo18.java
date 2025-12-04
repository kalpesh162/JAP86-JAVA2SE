class ExerciseNo18{
	public static void main(String[] args) {
		 int p = 10, q = 5, r = 2;
        int value = p++ - --q + r++ * --p - q-- + ++r + p;
        System.out.println("Value: " + value); 
	}
}