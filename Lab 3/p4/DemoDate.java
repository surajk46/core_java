class DemoDate
{
	public static void main(String [] args)
	{
		Date d1 = new Date();
		d1.showDate();
		d1.leap();
		d1.count();
		
		Date d2 =new Date(18,7,1997);
		d2.showDate();
		d2.leap();
		d2.count();
	}
}