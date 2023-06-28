package threaddemos;

public class CountDownJob implements Runnable  //1
{
	//2
	private Thread t;
	private int num;
	private String name;
	
	public CountDownJob()
	{
		//3
		t = new Thread(this);
	}
	
	public CountDownJob(String name,int num)
	{
		this.name = name;
		this.num = num;
		//3
		t = new Thread(this);
	}	
	
	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
		while(num > 0)
		{
			System.out.println(name+" counting : "+num);
			num--;
		}
	}

}
