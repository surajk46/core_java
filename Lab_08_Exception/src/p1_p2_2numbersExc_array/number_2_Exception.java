package p1_p2_2numbersExc_array;

public class number_2_Exception {
	public static void main(String[] args) {
		try {
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			System.out.println("Division is = "+n1/n2);
		}
		catch(NumberFormatException e)
		{
			System.out.println("please enter a valid");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please enter a argument");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont divide by zero");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
