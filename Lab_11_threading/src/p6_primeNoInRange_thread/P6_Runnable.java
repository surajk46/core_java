package p6_primeNoInRange_thread;

public class P6_Runnable implements Runnable {

	private Thread t;
	private int n1,n2;
	
	
	public P6_Runnable(int n1, int n2) {
		super();
		t=new Thread(this);
		this.n1 = n1;
		this.n2 = n2;
	}

	public Thread getT()
	{
		return t;
	}
	
	@Override
	public void run() {
		for(int n=n1;n<=n2;n++)
		{
			boolean flag=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.println(n+" is Prime No. ");
		}
	}
	
}
