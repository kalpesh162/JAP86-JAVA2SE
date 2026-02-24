class PerformanceTest{
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Kareena");
		StringBuffer sb2=new StringBuffer("Raveena");
		long startTime1=System.currentTimeMillis();
		for(int i=1;i<=10000000;i++)
			sb1.append("Kapoor");
		long endTime1=System.currentTimeMillis();

		long startTime2=System.currentTimeMillis();
		for(int i=1;i<=10000000;i++)
			sb2.append("Tandon");
		long endTime2=System.currentTimeMillis();

		System.out.println("StringBuilder  "+(endTime1-startTime1) +" ms");
		System.out.println("StringBuffer  "+(endTime2-startTime2) +" ms");
	}
}