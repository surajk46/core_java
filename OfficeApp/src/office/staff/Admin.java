package office.staff;

public class Admin extends Emp {
	private double bonus;
	
	
	
	public Admin() {
		super();
		this.bonus =0;
	}
	public Admin(String name, int dd, int mm, int yy, int empid, double salary, double bonus) {
		super(name, dd, mm, yy, empid, salary);
		this.bonus = bonus;
	}
	public Admin(double bonus) {
		super();
		this.bonus = bonus;
	}
	public String toString()
	{
		return super.toString()+"Bonus  = "+bonus+"\n";
	}
	public void display()
	{
		System.out.print("bonus = "+bonus+"\n");
	}
	public void calSalary()
	{
		double cal= getSalary()+bonus;
		System.out.print("Salary of admin = "+cal);
	}
}
