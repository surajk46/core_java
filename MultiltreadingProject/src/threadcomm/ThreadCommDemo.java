package threadcomm;

public class ThreadCommDemo {

	public static void main(String[] args) {
		//create stock
		//create producer,consumer
		//main thread will sleep
		//make producer and consumer run for some amt of time
		//calling stop now method on both the threads
		//final qty produced, qty consumed
		
		Stock s = new Stock();
		//newly created state
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
		//runnable
		p.t.start();
		c.t.start();
		
		//producer and consumer are running till main thread is sleeping
		try
		{
			Thread.sleep(50);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		//both the threads will be stopped indirectly
		p.stopNow();
		c.stopNow();
		
		try
		{
			p.t.join();
			c.t.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}		
		
		System.out.println("Total qty produced : "+s.qtyProduced);
		System.out.println("Total qty consumed : "+s.qtyConsumed);
		
	}

}
