class Customer
{
	// data members
	private String email;
	private Address address;

	// Constructors
	// Default Constructor
	public Customer()
	{
		

		this.email="";
		this.address=new Address();

	}

	public Customer(String email,String area,String city,String pincode)
	{
		this.email=email;
		this.address=new Address(area,city,pincode);
	}

	//Member function5
	public void displayInfo()
	{
		System.out.println("Email of Person : "+email);
		address.display();
	}

}