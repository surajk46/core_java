package Polymorphism;
class Programmer extends Emp
{
	private int extraHour;
	private int chargePerHour;
	
	
	public Programmer() {
		super();
		this.extraHour = 0;
		this.chargePerHour = 0;
	}

	public Programmer(String name, int d, int m, int y, int empId, double sal, int extraHour, int chargePerHour) 
	{
		super(name, d, m, y, empId, sal);
		this.extraHour = extraHour;
		this.chargePerHour = chargePerHour;
	}


	@Override
	public String toString() {
		return super.toString()+"\nProgrammer extraHour=" + extraHour + ", chargePerHour=" + chargePerHour;
	}

	@Override
	public double calSalary() {
		return getSal()+extraHour*chargePerHour;
	}
	
}
	
class Admin extends Emp
{
	private double bonus;

	public Admin() {
		super();
		this.bonus = 0;
	}

	public Admin(String name, int d, int m, int y, int empId, double sal, double bonus) {
		super(name, d, m, y, empId, sal);
		this.bonus = bonus;
	}


	@Override
	public String toString() {
		return super.toString()+"\nAdmin bonus=" + bonus;
	}

	@Override
	public double calSalary() {
		return getSal()+bonus;
	}
	
	
}
class SalesManager extends Emp
{
	private int target;
	private int incentive;
	
	public SalesManager() {
		super();
		this.target = 0;
		this.incentive = 0;
	}
	
	public SalesManager(String name, int d, int m, int y, int empId, double sal, int target, int incentive) {
		super(name, d, m, y, empId, sal);
		this.target = target;
		this.incentive = incentive;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nSalesManager target=" + target + "\nincentive=" + incentive;
	}

	@Override
	public double calSalary() {
		return getSal()+target*incentive;
	}
	
	
}

