package iodemos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class WritingInFile {

	public static void main(String[] args) {
		OutputStream os =null;
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			//os = new FileOutputStream("D:/myfiles/data.txt");
			os = new FileOutputStream("D:/myfiles/data.txt",true);
			System.out.println("Enter 'stop' to quit");
			String line;
			while( !((line = br.readLine()).equals("stop")))
			{
				os.write(line.getBytes());
			}			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not present");
		}
		catch(IOException e)
		{
			System.out.println("IO Error");
		}		
		finally
		{
			try {
				br.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
