package syncdemos;

public class PrintingJob implements Runnable { //1

	//2
	private Thread t;
	private Printer p;
	private String header,body,footer;
	
	public PrintingJob()
	{
		//3
		t = new Thread(this);
	}	
	
	public PrintingJob(Printer p, String header, String body, String footer) {
		super();
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
		//3
		t = new Thread(this);
	}	

	//4
	public Thread getT() {
		return t;
	}

	//5
	@Override
	public void run() {
		//p.print(header, body, footer);
		p.syncPrint(header, body, footer);
	}

}








