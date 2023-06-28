class Account
{
   //instance - non-static data members
   private int accno;
   private float balance;
   //static data member	
   private static float int_rate; 
    
   static
   {
	System.out.println("in static block");
	int_rate = 4.5f;
   }

   public Account()
   {
   }

   public Account(int accno, float balance)
   {
	this.accno = accno;
	this.balance = balance;
   }

   public static void updateRate(float nrate)
   {
	int_rate = nrate;
	//this.balance = 14000.00f;   //not allowed to access non-static
   }

   public static float getIntRate()
   {
	return int_rate;
   }		

   public double calBalance()
   {
	return balance+(balance*int_rate/100);
   }	
}