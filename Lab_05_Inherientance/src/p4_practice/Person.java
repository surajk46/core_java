package p4_practice;

class Person {
	private  String name;
	private Date bdate;
	
	public Person()
	{
		name="";
		bdate=new Date();
	}
	public Person(String name,int dd,int mm, int yy)
	{
		this.name=name;
		this.bdate=new Date(dd,mm,yy);
	}
	
	public String toString()
	{
		return "Name of Person = "+name+bdate;
	}
	
}
