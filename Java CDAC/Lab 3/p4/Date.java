class Date
{
	// data members
	private int dd;
	private int mm;
	private int yy;

	private static int c=0;

	// Constructors
	// Default Constructor
	public Date()
	{
		c=c+1;
		dd=4;
		mm=6;
		yy=2000;
	}

	public Date(int d,int m,int y)
	{
		c=c+1;
		dd=d;
		mm=m;
		yy=y;
	}

	//Member function
	public void showDate()
	{
		System.out.println(dd+" / "+mm+" / "+yy);
	}
	private boolean isLeapYear()
	{	
		boolean flag=false;
		if(yy%4==0  && (yy%400==0 || yy%100!=0))
		flag=true;
		return flag;
	}
	public void leap()
	{
		if(isLeapYear())
			System.out.println(yy + " is the Leap Year");
		else
			System.out.println(yy + " is Not Leap Year");
	}
	public void count()
	{
		System.out.println("count =" + c);
	}
}