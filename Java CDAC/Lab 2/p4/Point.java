class Point
{
	//DATA MEMBERS
	private int x;
	private int y;

	
	//Constructors
	public Point()
	{
		x=100;
		y=100;
	}
	public Point(int a,int b)
	{
		x=a;
		y=b;
	}
	public Point(int a)
	{
		x=a;
		
	}

	// MEMBER FUNTION
	public void showPoint()
	{
		System.out.println("[ "+x+" , "+y+" ]");
	}
}