package p4_firstname_lastname;

public class FirstLetterNotCapitalException extends Exception{
	private String message;

	public FirstLetterNotCapitalException() {
		super();
		message="First Name is not capital ";
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
