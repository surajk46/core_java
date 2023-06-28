class BoxDemo
{
	public static void main(String [] args)
	{
		Box b1=new Box();     // calling default constructor
		b1.showBox();	

		Box b2=new Box(3,3,3);     // calling fully parameterized Constructor
		b2.showBox();

		Box b3=new Box(10);	// calling semi parameterized Constructor
		b3.showBox();
	}
}