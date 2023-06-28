class Account
{
//Instance data Members
private int accno;
private float balance;

// Static data Members
private static float int_rate;

// Static Initialization
static
{
	System.out.println("From the static");
	int_rate=4.5f;				// initializing int_rate 4.5 
}


	//Constructors
	public Account(int accno, float balance)
	{
		this.accno=accno;
		this.balance=balance;
	}


	//Member Function
	public static float getIntRate()
	{
		return int_rate;
	}
	public static void updateIntRate(float n_rate)
	{
		int_rate=n_rate;
	}

	public double showBalance()
	{
		return balance+(balance*int_rate)/100;
	} 

}


public class AccountDemo
{
public static void main(String [] s)
{
	// Account a1;			// doesnt revoke the static as just object created not initialize
	// a1=new Account(5,4);		// as after obj creating we are initializing values that revoke static
	Account a1=new Account(1001,1000.00f);
	System.out.println("Interest rate="+Account.getIntRate());	//Static methods calls WRT Class name not Class obj
	System.out.println("Account Balance = " + a1.showBalance());	//Member functions calls WRT class object

	System.out.println();
	Account.updateIntRate(4.8f);
	
	Account a2=new Account(1005,1000.00f);
	System.out.println("Interest rate="+Account.getIntRate());	//Static methods calls WRT Class name not Class obj
	System.out.println("Account Balance = " + a2.showBalance());
}
}