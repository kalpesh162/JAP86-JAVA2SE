class Date{
	private int year;
	private int month;
	private int day;

	Date(int year,int month,int day){
		 if(year>=100 && year<=2200)
		 	this.year=year;
		 else
		 	 this.year=100;

		 if(month>=2 && month<=12)
		 	this.month=month;
		 else
		 	this.month=1;
		 if(day>=1 && day<=31)
		 	this.day=day;
		 else
		 	this.day=1;
	}


	void setDate(int year,int month,int day){
		 if(year>=100 && year<=2200)
		 	this.year=year;
		 else
		 	 this.year=100;

		 if(month>=2 && month<=12)
		 	this.month=month;
		 else
		 	this.month=1;
		 if(day>=1 && day<=31)
		 	this.day=day;
		 else
		 	this.day=1;
	}

}