package p4_firstname_lastname;
import java.util.Scanner;
public class Fname_Lname_main
{
	public static void main(String[] args)
	{
		Scanner sk=new Scanner(System.in);
		System.out.print("Enter Your First Name : ");
		String fname= sk.next();
		System.out.print("Enter Your last Name : ");
		String lname= sk.next();
		sk.close();
		try
		{
			if((fname.charAt(0)>='A' && fname.charAt(0)<='Z')  && (lname.charAt(0)>=65 && lname.charAt(0)<=90))
				{
					
				}
			else
				{
					throw new FirstLetterNotCapitalException();
				}
		}
		catch(FirstLetterNotCapitalException e)
			{
				System.out.println(e.getMessage());
			}
		try
		{
			int i,j;
			for(i=1, j=1; i<fname.length() && j<lname.length();i++,j++)
			if((fname.charAt(i)>='a' && fname.charAt(i)<='z')  && (lname.charAt(j)>='a' && lname.charAt(j)<='z'))
				{
					continue;
				}
			else
				{
					throw new RestOfLetterAreNotSmallException();
				}
		}
		catch(RestOfLetterAreNotSmallException e)
			{
				System.out.println(e.getMessage());
			}
		System.out.println("First name = "+fname);
		System.out.println("Last name = "+lname);
	}
}
