package p3;
import java.util.*;
public class RegCustomer extends Customer{
	private int reg_no;
	Scanner sc=new Scanner(System.in);
	
	
	//getter
	public int getReg_no() {
		return reg_no;
	}
	public RegCustomer(String email,String area,String city,String pincode,int reg_no)
	{
		super(email,area,city,pincode);
		this.reg_no=reg_no;
	}

	public RegCustomer() {
		super();
		System.out.println("Enter the Reg Customer Id : ");
		this.reg_no = sc.nextInt();
	}
	public void displayInfo()
	{
		super.displayInfo();
		System.out.print("Reg_no of Customer = "+reg_no+"\n");
	}
	public void giveDiscount(float price)
	{
		float c= price*0.95f;
		System.out.println("Final price : " +c);
	}
	
	
}
