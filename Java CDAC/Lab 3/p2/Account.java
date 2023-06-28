class Account
{
	// DATA MEMBERS
	private int id;
	private float bal;

	//static data member
	private static float int_rate;

	//static function
	static
	{
		int_rate=4.5f;
	}
	public static void updateIntRate(float nRate)
	{
		int_rate=nRate;
	}



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
	public void displayInfo()
	{
		System.out.println("Account id = "+id);
		System.out.println("Account Balance = "+bal);
	}
	private double balance()
	{
		//bal=(bal+(bal*int_rate)/100);
		return (bal+(bal*int_rate)/100);
	}
	public void displayBalance()
	{
		System.out.println("Interest Rate = "+int_rate);
		System.out.println("Account Balance Remaining = "+balance());
	}
	
}