class Calc
{
	//DATA MEMBERS
	private int no1;
	private int no2;

	
	//Constructors
	public Calc()
	{
		no1 = 1;
		no2 = 1;	
	}
	public Calc(int a,int b)
	{
		no1 = a;
		no2 = b;
	}

	// MEMBER FUNTION

	public void add()
	{
		System.out.printf("Addition of %d and %d is = %d \n",no1,no2,no1+no2);
	}

	public void sub()
	{
		System.out.printf("Substraction of %d and %d is = %d \n",no1,no2,no1-no2);
	}

	public void mul()
	{
		System.out.printf("Multiplication of %d and %d is = %d \n",no1,no2,no1*no2);
	}

	public void div()
	{
		System.out.printf("Division of %d WRT %d is = %d \n",no1,no2,no1/no2);
	}
}
