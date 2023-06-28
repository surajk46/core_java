package p3;

import java.util.Scanner;

class DemoMain
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the EmailId of Customer : ");
		String email=sc.nextLine();
		System.out.print("Enter the Area of Customer : ");
		String area=sc.nextLine();
		System.out.print("Enter the City of Customer : ");
		String city=sc.nextLine();
		System.out.print("Enter the Pincode of Customer : ");
		String pincode=sc.nextLine();
		
		
		System.out.print("Enter 0 for New customer And 1 For Registered Customer : ");
		int choice=sc.nextInt();
		
		System.out.print("Enter the Price Of Product = ");
		float price=sc.nextFloat();
		
		
		if (choice==1)
		{
			System.out.print("Enter Reg no : ");
			int reg_no=sc.nextInt();
			RegCustomer c=new RegCustomer(email,area,city,pincode,reg_no);
			c.displayInfo();
			c.giveDiscount(price);
		}
		if(choice==0)
		{
			Customer c=new Customer(email,area,city,pincode);
			c.displayInfo();
			c.giveDiscount(price);
			
		}
		sc.close();
		
	}
}