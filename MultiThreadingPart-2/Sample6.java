class Table{
	// Whole Code inside printTable 
	public  void printTable(int n){
		
		System.out.println("Executinh Thread  "+Thread.currentThread().getName());

		synchronized(this){
	
		for(int i=1;i<=5;i++){
	 		System.out.println(Thread.currentThread().getName()+" "+  n*i);
	 		
	 	}
	 }




	}
}

class One extends Thread{
	private Table table;
	One(Table table){ this.table=table;}
	@Override
	public void run(){
		table.printTable(5);
	}
}

class Two extends Thread{
	private Table table;
	Two(Table table){ this.table=table;}
	@Override
	public void run(){
			table.printTable(11);
	}
}

class Three extends Thread{
	private Table table;
	Three(Table table){ this.table=table;}
	@Override
	public void run(){
		table.printTable(13);
	}
}


class Sample6{
	public static void main(String[] args) {
		Table table=new Table();  // resource 
		One one=new One(table);
		Two two =new Two(table);
		Three three=new Three(table);

		one.setName("ONE");
		two.setName("TWO");
		three.setName("THREE");
		one.start();
		two.start();
		three.start();

	}


}
