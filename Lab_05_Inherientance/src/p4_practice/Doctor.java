package p4_practice;
public class Doctor extends Person{
	private String degree;
	private String reg_no;
	private String salary;
	private Address address;
	
	public Doctor()
	{
		super();
		degree="";
		reg_no="";
		salary="";
		address=new Address();
	}
	public Doctor(String name,int dd,int mm,int yy,String degree,String reg_no,String salary,String area,String city,String pincode)
	{
		super(name,dd,mm,yy);
		this.degree=degree;
		this.reg_no=reg_no;
		this.salary=salary;
		this.address=new Address(area,city,pincode);
	}
	public String toString()
	{
		return super.toString()+"\nDegree = "+degree+"\nReg_no = "+reg_no+"\nSalary = "+salary+"\n"+address;
	}
}
