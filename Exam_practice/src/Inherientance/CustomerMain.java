package Inherientance;

import java.util.Scanner;

class Customer
{
	private String email;
	private Address address;
	
	public Customer() {
		super();
		this.email = "";
		this.address = new Address();
	}

	public Customer(String email,String area,String city,String pincode ) {
		super();
		this.email = email;
		this.address = new Address(area,city,pincode);
	}

	public double giveDic(double price) {
		return price;

	}
	@Override
	public String toString() {
		return "\nCustomer email=" + email + "\n"+ address;
	}
	
}

class RegCustomer extends Customer
{
	private int reg_no;

	public RegCustomer() {
		super();
		this.reg_no = 0;

	}

	public RegCustomer(String email, String area, String city, String pincode, int reg_no) {
		super(email, area, city, pincode);
		this.reg_no = reg_no;
	}

	@Override
	public String toString() {
		return super.toString()+"\nRegCustomer reg_no=" + reg_no;
	}
	public double giveDic(double price) {
		return price*0.95;

	}
	
}

class Address
{
	private String area;
	private String city;
	private String pincode;
	
	
	public Address() {
		super();
		this.area = "";
		this.city = "";
		this.pincode = "";
	}

	public Address(String area, String city, String pincode) {
		super();
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address area=" + area + "\ncity=" + city + "\npincode=" + pincode ;
	}
	
}
public class CustomerMain {
	public static void main(String[] args) {
		Customer c=null;
		Scanner a=new Scanner(System.in);
		System.out.print("Enter 1 for customer 0 for reg Customer : ");
		int n=a.nextInt();
		if(n==1)
		{
			c=new Customer("sk","nijampur","mangaon","402120");
		}
		else
		{
			c=new RegCustomer("sk@123","nijampur","mangaon","402120",502);
		}
		System.out.print("Enter Price : ");
		double price=a.nextDouble();
		System.out.println(c);
		System.out.println("Final Price = "+c.giveDic(price));
	}
}
