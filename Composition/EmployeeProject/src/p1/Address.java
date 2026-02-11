package  p1;
public class Address{
	private String landmark;
	private String city;
	private int pincode;

	public Address(String landmark,String city,int pincode){
		this.landmark=landmark; this.city=city; this.pincode=pincode;
	}

	public void setLandMark(String landmark){ this.landmark=landmark;}
	public void setCity(String city){ this.city=city;}
	public void setPincode(int pincode){ this.pincode=pincode;}

	public String getLandMark(){ return this.landmark;}
	public String getCity(){ return this.city;}
	public int getPincode(){ return this.pincode;}


}