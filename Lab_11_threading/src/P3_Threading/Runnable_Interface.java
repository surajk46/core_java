package P3_Threading;

public class Runnable_Interface implements Runnable
{
	
	@Override
	public void run() 
	{
		for(int i=1;i<=15;i++)
		{
			try
			{
			System.out.println("from Runnable Interface :"+i);
			Thread.sleep(200);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
