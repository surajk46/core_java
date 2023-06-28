package threaddemos;

public class MyThread extends Thread {

	//task to be performed by thread
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child thread : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
