public class AccountDemo
{
   public static void main(String [] args)
   {
	Account a1;
	a1 = new Account(1001, 10000.00f);
        System.out.println("Current rate : "+Account.getIntRate());
	System.out.println(a1.calBalance());

	Account a2 = new Account(1010, 15000.00f);
	System.out.println(a2.calBalance());

	Account.updateRate(4.8f);
	System.out.println("Current rate : "+Account.getIntRate());
	System.out.println(a1.calBalance());
        System.out.println(a2.calBalance());
   }
}