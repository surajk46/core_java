class MyNumberDemo
{
	public static void main(String [] a)
	{
		boolean c;
		MyNumber m1=new MyNumber(25);
		c=m1.isPositive();
		if(c==true)
			System.out.println( m1.shivam() +" is Positive");

		c=m1.isNegative();
		if(c==true)
			System.out.println( m1.shivam() +" is Negative");

		c=m1.isZero();
		if(c==true)
			System.out.println( m1.shivam() +" is Zero");

		c=m1.isEven();
		if(c==true)
			System.out.println( m1.shivam() +" is Even" );

		c=m1.isPositive();
		if(c==true)
			System.out.println( m1.shivam() +" is Odd" );

	}
}