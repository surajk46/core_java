package office.staff;

public class SalesManager extends Emp {
	private float incentive;
	private float target;
	
	
	public SalesManager() {
		super();
	}


	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, float incentive, float target) {
		super(name, dd, mm, yy, empid, salary);
		this.incentive = incentive;
		this.target = target;
	}
	
	public String toString()
	{
		return super.toString()+"Incentive = "+incentive+"\n Target = "+target+"\n";
	}
	public void display() {
		System.out.println("Incentive = "+incentive+"\n Target = "+target);
	}
	public void calSalary()
	{
			double sal=getSalary()+target*incentive;
			System.out.print("Salary of SalesManager = "+sal);
	}
}
