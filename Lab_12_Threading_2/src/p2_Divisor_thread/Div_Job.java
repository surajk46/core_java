package p2_Divisor_thread;

public class Div_Job implements Runnable{
	private Thread t;
	private int n;
	private Div_Writer d;
	
	public Div_Job() {
		super();
		t=new Thread();
	}
	public Div_Job(Div_Writer d, int n) {
		super();
		t=new Thread(this);
		this.n = n;
		this.d=d;
	}
	
	public Thread getT() {
		return t;
	}
	@Override
	public void run() {
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				d.writer(i);
			}
		}
	}
	
	
	
	
}
