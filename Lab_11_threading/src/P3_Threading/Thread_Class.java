package P3_Threading;

public class Thread_Class extends Thread{
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			try
			{
			System.out.println("from thread class :"+i);
			Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
