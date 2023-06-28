class Complex
{
	//DATA MEMBERS
	private int real;
	private int img;

	
	//Constructors
	public Complex()
	{
		real =100;
		img = 100;	
	}
	public Complex(int a,int b)
	{
		real=a;
		img=b;
	}

	// MEMBER FUNTION
	public void display()
	{
		if(img>=0)
			System.out.println(real+"  + "+img+"i");
		else
			System.out.println(real+" "+img+"i");
	}
}