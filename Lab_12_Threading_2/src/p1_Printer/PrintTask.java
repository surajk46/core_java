package p1_Printer;

public class PrintTask implements Runnable{

	private Thread t;
	private Printer p;
	private String header,body,footer;
	
	
	
	public PrintTask() {
		super();
		t = new Thread(this);
	}
	public PrintTask(Printer p, String header, String body, String footer) {
		super();
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
		t = new Thread(this);
	}
	public Thread getT()
	{
		return t;
	}

	@Override
	public void run() {
		p.print(header, body, footer);
		
	}
	
}
