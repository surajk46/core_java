package p4_file_IO;

import java.io.*;

public class P6_Number_the_line {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter File name : ");
		String f1=br.readLine();
		BufferedReader b=new BufferedReader(new FileReader("L:\\myfiles\\"+f1));
		int count=0;
		String line="";		
		while((line=b.readLine())!=null)
		{
			count++;
			System.out.println(count +"."  + line);
			//System.out.print((char)n);
		}
	}
}
