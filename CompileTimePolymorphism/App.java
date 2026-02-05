class Operation{
	void doAdd(int x,int y){   // doAdd2i
		 System.out.println(x+y);
	}
	void doAdd(int x,int y,int z){  // // doAdd3i
		 System.out.println(x+y+z);
	}
	void doAdd(int x,double y){  // // doAdd1i1d
		 System.out.println(x+y);
	}
	void doAdd(double x,int y){  // // doAdd1d1i
		 System.out.println(x+y);
	}
}
class App{
	public static void main(String[] args) {
		Operation op=new Operation();
		// Binding od method call decides at compike time called as Compiler Time Polymormism
		// Early Binding
		// Static Binding
		op.doAdd(11,22);
		// What is Op  --> Op is a type Operation
		// Operation --> doAdd
		// doAdd2i
		// op --> binding 
		op.doAdd(11,22,22);
		op.doAdd(11,22.22);
		op.doAdd(11.11,22);

	}
}