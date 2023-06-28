package p4_firstname_lastname;

public class RestOfLetterAreNotSmallException extends Exception{
	private String message;

	public RestOfLetterAreNotSmallException() {
		super();
		message="Rest Of letters Are Not small ";
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
