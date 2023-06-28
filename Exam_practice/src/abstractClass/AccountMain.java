package abstractClass;

import java.util.Scanner;

abstract class Account
{
	private int accno;
	private String name;
	private double balance;
	
	public Account(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public abstract void withdraw(double withdraw);
	public abstract double calBalance();

	public String toString() {
		return "Account accno = " + accno + "\nname=" + name + "\nbalance=" + balance;
	}
}

class SavingAccount extends Account
{
	private static float int_rate;
	static
	{
		int_rate=4.7f;
	}
	public SavingAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}
	@Override
	public void withdraw(double withdraw) 
	{
		if(super.getBalance()<=2000)
		{
			System.out.println("withdraw is Unsuccesful as vailable balance is below 2000 ");
		}
		else {
			System.out.println("Withdraw is successfull... \navailable Balance = "+(super.getBalance()-withdraw));
		}
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public double calBalance() {
		
		return super.getBalance()+(super.getBalance()*int_rate)/100;
	}
	
	
}

class ReccuringAccount extends Account
{
	private double installment;
	private int noOfInst;
	private static float int_rate;
	static
	{
		int_rate=4.7f;
	}

	public ReccuringAccount(int accno, String name, double balance, double installment, int noOfInst) {
		super(accno, name, balance);
		this.installment = installment;
		this.noOfInst = noOfInst;
	}

	public ReccuringAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void withdraw(double withdraw) {
		System.out.println("withdraw is unsuccessfull as this is recurring Account ");
		
	}

	@Override
	public double calBalance() {
		double b=super.getBalance()+installment*noOfInst;
		return b+(b*int_rate)/100;
	}
	
	
}
public class AccountMain {

	public static void main(String[] args) {
		Account a=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for saving account and 0 for recurring account ");
		int n=sc.nextInt();
		if(n==1)
		{
			a=new SavingAccount(125, "shubham",20000);
			System.out.print("enter withdraw amount = ");
			double w=sc.nextDouble();
			a.withdraw(w);
			System.out.println("balance after int rate = "+a.calBalance());
		}
		else {
			a=new ReccuringAccount(125, "shubham",20000,2000,12);
			System.out.print("enter withdraw amount = ");
			double w=sc.nextDouble();
			a.withdraw(w);
			System.out.println("balance after int rate = "+a.calBalance());

		}
	}

}
