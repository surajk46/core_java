package p2;

public class Emp extends Person {
	private int empId;
	private double salary;
	public Emp() {
		super();
	}
	public Emp(String name, int d, int m, int y, int empId, double salary) {
		super(name, d, m, y);
		this.empId = empId;
		this.salary = salary;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Employee Id = " + empId);
		System.out.println("Employee Salary = " + salary);
	}
}
