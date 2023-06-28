package threaddemos;

public class MyJob implements Runnable  { //1.

	//2.
	private Thread t;
	
	public MyJob()
	{
		//3.
		t=new Thread(this);
	}
	
	//4.
	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
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
