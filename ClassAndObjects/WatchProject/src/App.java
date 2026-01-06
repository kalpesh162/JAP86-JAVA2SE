class App{
	public static void main(String[] args) {
		
		Watch rolex=new Watch();  // 10 10 10
		//rolex.hr=11;
		rolex.setHr(11);

		Watch fasttrack=new Watch(1,2,3);

		fasttrack.displayWatch();
		rolex.displayWatch();

	}
}