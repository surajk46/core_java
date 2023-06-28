package p3_account;

public class RecurringAccount extends Account{
	private double inst_amount;
	private int no_of_inst;
	
	
	public RecurringAccount() {
		super();
	}


	public RecurringAccount(double inst_amount, int no_of_inst) {
		super();
		this.inst_amount = inst_amount;
		this.no_of_inst = no_of_inst;
	}
	public  void withdraw(double amt)
	{
		System.out.println("Withdrawal is UnsuccessFul as this is Recurring Account ");
	}
	
	
}
