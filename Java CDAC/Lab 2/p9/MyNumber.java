class MyNumber
{
	//DATA MEMBERS
	private int n;

	
	//Constructors
	public MyNumber()
	{
		n=0;	
	}
	public MyNumber(int n)
	{
		this.n=n;
	}

	// MEMBER FUNTION
	public boolean isPositive()
	{
		boolean flag=false;
		if(n>0)
			flag=true;
		return flag;
	}
	public boolean isNegative()
	{
		boolean flag =false;
		if(n<0)
			flag=true;
		return flag;
	}
	public boolean isEven()
	{
		boolean flag=false;
		if(n%2==0)
			flag=true;
		return flag;
	}
	public boolean isOdd()
	{
		boolean flag=false;
		if(n%2==1)
			flag=true;
		return flag;
	}
	public boolean isZero()
	{	
		boolean flag=false;
		if(n==0)
			flag=true;
		return flag;
	}
	public int shivam()
	{
		return n;
	}
}