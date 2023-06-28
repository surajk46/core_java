package p1_pwdException;

public class PasswordTooShortException extends Exception {
	private String message;
	
	public PasswordTooShortException()
	{
		super();
		message="Password Contain Less Than 8 characters ";
	}
	public String getMessage()
	{
		return message;
	}
	public String toString()
	{
		return message;
	}
}
