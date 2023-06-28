class Person
{
	// data members
	private String name;
	private Date bdate;



	// Constructors
	// Default Constructor
	public Person()
	{
		
	}

	public Person(String name,int d,int m,int y)
	{
		this.name=name;
		this.bdate=new Date(d,m,y);
	}

	//Member function
	public void display()
	{
		System.out.println("Name of Person : "+name);
		if(bdate!=null)
		{
			System.out.println("BirthDate of Person : ");
			bdate.showDate();
		}
	}

}