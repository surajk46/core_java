package p2_student_country;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void registerUser()
	{
		try
		{
			Scanner sk=new Scanner(System.in);
			System.out.print("Enter Your User Name : ");
			String userName= sk.next();
			System.out.print("Enter Your Country Name : ");
			String userCountry= sk.next();
			//if(userCountry.equals("india"))
			if(userCountry.equalsIgnoreCase("india"))
			{
				System.out.println("User Registration Done Successfully....");
			}
			else
			{
				throw new InvalidCountryException();
			}
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		registerUser();	
	}
}
