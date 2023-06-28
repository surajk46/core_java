package p4_practice;

public class Address {
	private String area;
	private String city;
	private String pincode;
	
	public Address()
	{
		area="";
		city="";
		pincode="";
	}
	public Address(String area,String city,String pincode)
	{
		this.area=area;
		this.city=city;
		this.pincode=pincode;
	}
	
	public String toString()
	{
		return "\nArea = "+area+"\n city = "+city+"\n Pincode = "+pincode;
	}
	
	public void display()
	{
		System.out.print("\nArea = "+area+"\n city = "+city+"\n Pincode = "+pincode);
	}
}
