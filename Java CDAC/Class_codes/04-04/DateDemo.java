class Date
{
//data Members
private int dd,mm,yy;


// Constructors
	public Date()
	{
		System.out.println("from Default Constructor");
	}
	public Date(int dd,int mm,int yy)
	{
		System.out.println("from Fully Parameterized Constructor");
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public Date(int dd,int mm)
	{
		System.out.println("from semi Parameterized Constructor");
		this.dd=dd;
		     mm=mm;
		//this.yy=yy;
	}
	
	public Date(Date d)
	{
		System.out.println("from Object or copy Constructor");
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
	}



	//Member Function
	public void showDate()
	{
		System.out.println(dd+" / "+mm+" / "+yy);
	} 
	public void showDate(char ch)
	{
		System.out.println(dd+ch+mm+ch+yy);        //gives number
		System.out.println(dd+""+ch+mm+""+ch+yy);	//gives string
	} 

}


public class DateDemo
{
public static void main(String [] s)
{
	Date d1=new Date();
	d1.showDate();		//   0 / 0 / 0

	Date d2=new Date(4,6,2000);
	d2.showDate('-');		// 	4 / 6 / 2000

	Date d3=new Date(4,6);
	d3.showDate();		//	4 / 0 / 0
	
	Date d4=new Date(d2);
	d4.showDate();		//	 4 / 6 / 2000
}
}