package opps2;

public class String1 {

	public static void main(String[] args) {
		
		try
		{
			String a="kajal sharma";
//			double d=5266.554;
//			String q=Double.toString(d);
			System.out.println(a.length());
//			System.out.println(d);
//			System.out.println(q);
			System.out.println(a.charAt(a.length()));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
