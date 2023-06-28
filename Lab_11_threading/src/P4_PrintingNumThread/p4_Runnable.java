package P4_PrintingNumThread;

public class p4_Runnable implements Runnable {//step 1 implement
			//step 2 make Thread data member
	private Thread t;
	private int n;
			//step 3 make costructor
	public p4_Runnable(int n)
	{
		this.n=n;
		t=new Thread(this);
	
	}
	
			//step 4 getter for t
	public Thread getT()
	{
		return t;
	}
	
	
			//step 5 implement run() method
	public void run() {
		for(int i=n;i>=0;i--)
		{
			System.out.println(i);
			try {
				Thread.sleep(300);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
