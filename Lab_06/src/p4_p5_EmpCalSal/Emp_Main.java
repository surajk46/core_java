package p4_p5_EmpCalSal;
class Person
{
	private String name;
	private Date bdate;
	
	public Person() {
		super();this.name = "";
		this.bdate = new Date();
	}
	public Person(String name, int d,int m,int y) {
		super();
		this.name = name;
		this.bdate = new Date(d,m,y);
	}
	@Override
	public String toString() {
		return "Person name=" + name + "\nbdate=" + bdate;
	}
	
	
}
abstract class Emp extends Person
{
	private int empId;
	private double sal;
	
	public Emp() {
		super();
		this.empId = 0;
		this.sal = 0;
	}
	
	public Emp(String name, int d, int m, int y, int empId, double sal) {
		super(name, d, m, y);
		this.empId = empId;
		this.sal = sal;
	}
	
	
	public int getEmpId() {
		return empId;
	}

	public double getSal() {
		return sal;
	}

	public abstract double calSalary();
}


class Date
{
	int dd,mm,yy;

	public Date() {
		super();
		this.dd = 0;
		this.mm = 0;
		this.yy = 0;
	}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "BirthDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy;
	}
	
}
public class Emp_Main {
	public static void main(String[] args) {
		Emp []e= {(new Programmer("sourabh",12,11,1999,52,60000.0,50,25)),
				  (new SalesManager("omkar",10,8,1999,24,100000.0,25,25)),
				  (new Admin("nishchay",21,02,2001,32,15000.0,50000))};
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
			System.out.println("salary of Employee of having id = "+e[i].getEmpId()+" = "+e[i].calSalary());
			System.out.println("*******************************************");
		}
		
	}
}
