class Date
{
	// data members
	private int dd;
	private int mm;
	private int yy;

	// Constructors
	// Default Constructor
	public Date()
	{
		dd=4;
		mm=6;
		yy=2000;
	}

	public Date(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}

	//Member function
	public void showDate()
	{
		System.out.println(dd+" / "+mm+" / "+yy);
	}
}