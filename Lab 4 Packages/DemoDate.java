import office.utility.Date;
import office.staff.Person;
public class DemoDate
{
	public static void main(String [] args)
	{
	/*	Date d1 = new Date();
		d1.showDate();
		d1.leap();
		
		Date d2 =new Date(18,7,1997);
		d2.showDate();
		d2.leap();
	*/
		
		Person p1=new Person("Shiv",28,3,2001);
		p1.display();

		Person p2=new Person("Shiv",17,10,1998);
		p2.display();

		Person p3=new Person();
		p3.display();
	}
}