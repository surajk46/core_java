package p1_Printer;

public class Printer {
	public void print(String header, String body, String footer)
	{
		synchronized (this) {
			try
			{
				System.out.println(header);
				Thread.sleep(1000);
				System.out.println(body);
				Thread.sleep(1000);
				System.out.println(footer);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
}
