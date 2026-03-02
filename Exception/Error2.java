class Error2{
	public static void main(String[] args) {
		// 2^31-1   2147483647
		//java.lang.OutOfMemoryError:
		int arr[]=new int[Integer.MAX_VALUE];

	}
}

// Whats diff between Exception AND Error

// VMError
// OutOfMemoryError
// StackOverflowError   --> Recursion
