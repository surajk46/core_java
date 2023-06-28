package p4;

public class Date
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

	

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
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


	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

}