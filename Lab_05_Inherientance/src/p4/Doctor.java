package p4;
public class Doctor extends Person{
	private String deegree;
	private String reg_no;
	private double salary;
	
	
	
	public Doctor() {
		//super();
		System.out.print("Enter Degree of Doctor : ");
		this.deegree = sc.nextLine();
		System.out.print("Enter Reg_no of Doctor : ");
		this.reg_no = sc.nextLine();
		System.out.print("Enter Salary of Doctor : ");
		this.salary = sc.nextDouble();
	}

	public void name() {
		
	}

	public void display()
	{
		super.display();
		System.out.print("Name of Doctor : "+deegree);
		System.out.print("Reg_no of Doctor : "+reg_no);
		System.out.print("salary Of Doctor : "+salary);
	}


	public String toString() {
		return super.toString()+"Doctor degree = " + deegree+ "\nreg_no = "+reg_no+"\nsalary = "+salary;
	}
	
}
