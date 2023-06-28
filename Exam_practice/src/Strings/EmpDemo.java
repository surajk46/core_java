package Strings;

class Emp {
	private int empid;
	private String name;
	private double salary;

	public Emp(int empid, String name, double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	
	public int getEmpId()
	{
		return empid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return "Emp with name"+name+" having: "+salary;
	}
}




public class EmpDemo {

	public static void main(String[] args) {
		try
		{
			if(args.length%2 !=0 && args.length>=3)
			{
				Emp[] arr=new Emp[(args.length-1)/2];
				int j=0;
				for(int i=0; i<args.length; i+=2)
				{
					arr[j++]=new Emp(j,args[i], Double.parseDouble(args[i+1]));
					
				}
//				Dept d=new Dept(1, args[0],arr);
//				System.out.println(d.empWithMaxSal());
			}
			else
			{
				System.out.println("Insuffiecients arguments");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}




class Dept extends Emp{
	private int deptno;
	private String dname;
	private Emp[] emps;
	
	public Dept(int empid,String name, double salary,int deptno, String dname)
	{
		super(empid,name,salary);
		this.deptno=deptno;
		this.dname=dname;

	}


//	public double empWithMaxSal()
//	{
//		if(emp[0].salary>emp[1].salary)
//			return emp[0];
//	}
}









