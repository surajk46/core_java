class Account
{
	// DATA MEMBERS
	private int id;
	private float bal;


	// CONSTRUCTORS
	// FULL PARAMETERIZED CONSTRUCTOR
	public Account(int id,float bal)
	{
		this.id=id;
		this.bal=bal;
	}


	//MEMBER FUNCTION
	public void display()
	{
		System.out.println("Account id = "+id);
		System.out.println("Account Balance = "+bal);
	}
	
}