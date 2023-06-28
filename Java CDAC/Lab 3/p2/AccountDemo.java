class AccountDemo
{
	public static void main(String [] args)
	{
		Account a1=new Account(1001,10000.00f); 
		a1.display();
		a1.displayBalance();

		System.out.println();

		Account a2=new Account(1002,10000.00f); 
		a2.display();
		a2.displayBalance();			//its a member function so call WRT **object of class name**
		Account.updateIntRate(5.0f);          //its a static function so call WRT *class name*
		a2.displayBalance();
	}
}