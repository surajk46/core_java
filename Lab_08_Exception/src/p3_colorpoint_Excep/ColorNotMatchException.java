package p3_colorpoint_Excep;

public class ColorNotMatchException extends Exception {
	public String message;
	
	public ColorNotMatchException() {
		super();
		message ="Given Color Is not Match In Given Colours Array ";
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
