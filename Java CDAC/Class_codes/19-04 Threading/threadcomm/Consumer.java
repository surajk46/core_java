package threadcomm;

public class Consumer implements Runnable {
	//2
		Thread t;
		Stock s;
		boolean bRun;
		
		public Consumer()
		{
			//3
			t=new Thread(this);
			bRun=true;
		}	
		
		public Consumer(Stock s) {
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
				s.consume();
		}
		
		public void stopNow()
		{
			bRun = false;
		}

}
