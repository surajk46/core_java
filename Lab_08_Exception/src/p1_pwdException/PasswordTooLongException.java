package p1_pwdException;

public class PasswordTooLongException extends Exception {
	private String message;

	public PasswordTooLongException() {
		super();
		message="Password Contain More than 12 characters ";
	}
	public String getMessage() {
		return message;
	}
	public String toString()
	{
		return message;
	}
	
}
