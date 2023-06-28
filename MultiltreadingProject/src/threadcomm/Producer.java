package threadcomm;

public class Producer implements Runnable { //1

	//2
	Thread t;
	Stock s;
	boolean bRun;
	
	public Producer()
	{
		//3
		t=new Thread(this);
		bRun=true;
	}	
	
	public Producer(Stock s) {
		super();
		this.s = s;
		//3
		t=new Thread(this);
		bRun=true;
	}

	//5
	@Override
	public void run() {
		while(bRun)
			s.produce();
	}
	
	public void stopNow()
	{
		bRun = false;
	}

}
