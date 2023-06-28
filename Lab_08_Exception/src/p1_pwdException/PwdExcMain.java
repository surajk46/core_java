package p1_pwdException;

import java.util.Scanner;

public class PwdExcMain {

	public static void main(String[] args) {
		try
		{
			Scanner sk=new Scanner(System.in);
			System.out.print("Enter Your Password : ");
			String pwd = sk.next();
			if(pwd.length()>12)
			{
				throw new PasswordTooLongException();
			}
			if(pwd.length()<8)
			{
				throw new PasswordTooShortException();
			}
			System.out.println("Your password saved Succefully...");
		}
		catch(PasswordTooLongException e)
		{
			System.out.println(e.getMessage());
		}
		catch(PasswordTooShortException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
