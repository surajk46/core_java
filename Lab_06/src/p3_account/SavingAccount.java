package p3_account;

public class SavingAccount extends Account{
	
	public SavingAccount()
	{
		super();
	}
	public SavingAccount(int accno,String name,double balance) {
		super(accno,name,balance);
	}
	public void withdraw(double amt)
	{
		if(getBalance()<=2000)
		{
			System.out.println("Withdrawal is UnsuccessFul as Balance is Below 2000");
		}
		else
		{
			System.out.println("Withdrawal is successFul as Balance is "+(getBalance()-amt));
		}
	}
}
