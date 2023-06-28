package p3_EmpReadWrite;

import java.io.Serializable;

public class Emp extends Person implements Serializable{
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
		System.out.println("Employee Id = " + empId);
		System.out.println("Employee Salary = " + salary);
	}
	@Override
	public String toString() {
		return super.toString()+"\nEmp [empId=" + empId + ", salary=" + salary + "]";
	}
	
}
