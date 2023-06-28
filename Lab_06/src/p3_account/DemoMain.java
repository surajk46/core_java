package p3_account;
import java.util.*;
public class DemoMain {
	public static void main(String[] args) {
		Scanner shivam=new Scanner(System.in);
		Account acc[]=new Account[1];
		acc[0]=new SavingAccount();
		for(int i=0;i<acc.length;i++)
		{
			System.out.print("Enter Account Number : ");
			int accno=shivam.nextInt();
			System.out.print("Enter Account Holder Name : ");
			String name=shivam.next();
			System.out.print("Enter Account Balance : ");
			double balance=shivam.nextDouble();
			System.out.print("Enter Withdraw amount : ");
			double amt=shivam.nextDouble();
			
			
			
			System.out.print("Enter 0 for saving Account and 1 for recurring account : ");
			int j=shivam.nextInt();
			if(j==0)
			{
				acc[i]=new SavingAccount(accno,name,balance);
				acc[i].withdraw(amt);
			}
			else if(j==1)
			{
				acc[i]=new RecurringAccount();
				acc[i].withdraw(amt);
			}

		}
	}
}
