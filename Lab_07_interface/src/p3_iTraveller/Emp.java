package p3_iTraveller;



abstract class Emp extends Person 
{
	private int empid;
	private double salary;
	
	
	public Emp() {
		super();
		this.empid=0;
		this.salary=0;
	}
	public Emp(int empid, double salary) 
	{
		super();
		this.empid = empid;
		this.salary = salary;
	}
	public Emp(String name,int dd,int mm,int yy,int empid, double salary) 
	{
		super(name,dd,mm,yy);
		this.empid = empid;
		this.salary = salary;
	}
	
	
	public String toString()
	{
		return super.toString()+"\nempid=" + empid + "\nsalary=" + salary;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid = empid;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public abstract void calSalary();

}