package threaddemos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy implements Runnable{
	private Thread t;
	private String source,destination;

	public FileCopy(String source,String destination)
	{
		this.destination=destination;
		this.source=source;
		t=new Thread(this);
	}
	
	public Thread getT()
	{
		return t;
	}
	
	public void run()
	{
		FileReader fr=null;
		FileWriter wr=null;
		try
		{
			fr=new FileReader(source);
			wr=new FileWriter(destination);
			int n=0;
			while((n=fr.read())!=-1)
			{
				wr.write((char)n);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
				wr.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
}
