package iodemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptCharacter {

	public static void main(String[] args) 
	{

		BufferedReader br =null;
		try
		{
			//1.open the stream
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'q' to quit");
			int n;
			//2. use the stream
			while((n=br.read()) != 'q')
			{
				System.out.println((char)n);
			}			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				//3.close stream
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
