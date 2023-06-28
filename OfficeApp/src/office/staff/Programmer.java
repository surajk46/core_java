package office.staff;

public class Programmer extends Emp {
	private float charge_per_hour;
	private float extra_hour;
	
	
	public Programmer() {
		super();
		this.charge_per_hour=0;
		this.extra_hour=0;
	}


	public Programmer(String name, int dd, int mm, int yy, int empid, double salary, float charge_per_hour,
			float extra_hour) {
		super(name, dd, mm, yy, empid, salary);
		this.charge_per_hour = charge_per_hour;
		this.extra_hour = extra_hour;
	}


	public Programmer(float charge_per_hour, float extra_hour) {
		super();
		this.charge_per_hour = charge_per_hour;
		this.extra_hour = extra_hour;
	}
	public String toString()
	{
		return super.toString()+"charge per Hour = "+charge_per_hour+"\nExtra hour = "+extra_hour+"\n";
	}
	public void display()
	{
		System.out.print("charge per Hour = "+charge_per_hour+"\nExtra hour = "+extra_hour+"\n");
	}
	public void calSalary()
	{
		double sal=getSalary()+ charge_per_hour*extra_hour;
		System.out.print("Salary of Programmer = "+sal);
	}
}
