package p3;

class Customer
{
	// data members
	private String email;
	private Address address;
//	private float price;

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
		//this.price=price;
	}

	//Member function5
	public void displayInfo()
	{
		System.out.print("Email of Person : "+email+"\n");
		address.display();
	}
	public void giveDiscount(float price)
	{
		float c= price;
		System.out.println("Final price : " +c);
	}

}