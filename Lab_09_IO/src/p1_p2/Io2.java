package p1_p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Io2 {
	public static void main(String[] args) {
		BufferedReader b = null;
		try
		{
			b = new BufferedReader(new InputStreamReader(System.in));
			String line= "";
			int m =0;
			String sivam ="";
			System.out.println("Enter \"stop\" to quit");
			while(!((line=b.readLine()).equalsIgnoreCase("stop")))
			{
				if(m < line.length())
				{
					m = line.length();
					sivam =line;
				}
				//System.out.println(line);
			}
			System.out.println(sivam);

		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				b.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}


}
