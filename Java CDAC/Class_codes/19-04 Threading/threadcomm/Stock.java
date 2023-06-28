package threadcomm;

//shared resource - locked
public class Stock {
	int qtyProduced;
	int qtyConsumed;
	boolean bProduced;
	
	public Stock()
	{
		//qtyProduced=qtyConsumed=0;
		//bProduced=false;
	}
	
	public synchronized void produce()
	{
		/*qtyProduced++;
		System.out.println("produced : "+qtyProduced);*/
		if(bProduced)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//bProduced is false
		qtyProduced++;
		System.out.println("produced : "+qtyProduced);
		bProduced=true;
		notify();
		
	}
	
	public synchronized void consume()
	{
		/*qtyConsumed++;
		System.out.println("consumed : "+qtyConsumed);*/
		if(!bProduced)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//bProduced is true
		qtyConsumed++;
		System.out.println("consumed : "+qtyConsumed);
		bProduced = false;
		notify();
	}
	

}
