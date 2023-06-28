package P5_Thread_copy;

import java.io.*;

public class P5_Runnable implements Runnable{
	private Thread t;
	private String source;
	private String destination;
	
	
	public P5_Runnable(String source,String destination)
	{
		t=new Thread(this);
		this.source=source;
		this.destination=destination;
	}
	public Thread getT()
	{
		return t;
	}
	public void run()
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("L:/myfiles/"+source));
			BufferedWriter bw=new BufferedWriter(new FileWriter("L:/myfiles/"+destination));

			int n=0;
			String line="";
			while((line=br.readLine())!=null)
			{
			
				System.out.println(line);
				line=line+"\n";
				bw.write(line);
				//System.out.print((char)n);
			}
			bw.close();
			System.out.println("File Write at L:/myfiles/"+destination+" succesfilly");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
