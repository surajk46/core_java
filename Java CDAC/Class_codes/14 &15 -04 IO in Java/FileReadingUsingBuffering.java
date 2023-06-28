package iodemos;
import java.io.*;
public class FileReadingUsingBuffering {

	public static void main(String[] args) {
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("D:/myfiles/buffer.txt"));
			String line;
			int count=1;
			int max=0;
			int maxLineNo=0;
			String maxLine="";
			while((line = br.readLine()) != null)
			{
				if(max<line.length())
				{
					max=line.length();
					maxLine=line;
					maxLineNo=count;
							
				}
				//System.out.println(count+". "+line);
				count++;				
			}
			System.out.println(maxLineNo+". "+maxLine);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
