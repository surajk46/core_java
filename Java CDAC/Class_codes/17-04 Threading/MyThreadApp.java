package threaddemos;

public class MyThreadApp {

	public static void main(String[] args) 
	{
		//main thread
		Thread t = new MyThread();
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
