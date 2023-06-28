package p2_student_country;

public class InvalidCountryException extends Exception {
	private String message;

	public InvalidCountryException() {
		super();
		message="User outside India cannot be Registred ";
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
