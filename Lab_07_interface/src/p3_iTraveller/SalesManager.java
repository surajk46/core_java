package p3_iTraveller;

public class SalesManager extends Emp implements ITraveller{
	private float incentive;
	private float target;
	private int noOfdaysTravell;
	
	public SalesManager() {
		super();
	}


	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, float incentive, float target,
			int noOfdaysTravell) {
		super(name, dd, mm, yy, empid, salary);
		this.incentive = incentive;
		this.target = target;
		this.noOfdaysTravell = noOfdaysTravell;
	}


	public String toString()
	{
		return super.toString()+"\nIncentive = "+incentive+"\nTarget = "+target;
	}
	public void display() {
		System.out.println("Incentive = "+incentive+"\n Target = "+target);
	}
	public void calSalary()
	{
			double sal=getSalary()+target*incentive +calculateTA();
			System.out.print("Salary of SalesManager = "+sal);
	}


	@Override
	public double calculateTA() {
		double cal=(getSalary()*DA/100)*noOfdaysTravell;
		return  cal;
	}
}
