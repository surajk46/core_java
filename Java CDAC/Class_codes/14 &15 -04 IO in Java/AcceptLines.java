package iodemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptLines {

	public static void main(String[] args) {
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			String line;
			System.out.println("Enter 'stop' to quit");
			int max=0;
			String maxLine="";
			while(!((line = br.readLine()).equals("stop")))
			{
				//System.out.println(line);
				if(max < line.length())
				{
					max=line.length();
					maxLine=line;
				}				
			}
			System.out.println(maxLine);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
