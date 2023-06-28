package p3;

class Address
{
	// data members
	private String area;
	private String city;
	private String pincode;



	// Constructors
	// Default Constructor
	public Address()
	{
		this.area="";
		this.city="";
		this.pincode="";
	}

	public Address(String area,String city,String pincode)
	{
		this.area=area;
		this.city=city;
		this.pincode=pincode;
	}

	//Member function
	public void display()
	{
		System.out.print("Name of Person : "+area);
		System.out.println("BirthDate of Person : "+city);
		System.out.println("Name of Person : "+pincode);
	}

}