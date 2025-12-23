
class BasicOperation{

	static void doAdd(int x,int y){
        int res=x+y;
        System.out.println(res);
	}

	static void doSub(int x,int y){
        int res=x-y;
        System.out.println(res);
	}

static void doMul(int x,int y){
        int res=x*y;
        System.out.println(res);
	}

static void doDiv(int num1,int num2){
        int res=num1/num2;
        System.out.println(res);
	}
	
	public static void main(String[] args) {
		int num1=11;
		int num2=22;
		int res;

		doAdd(num1,num2);
		doDiv(num1,num2);
		
	}
}