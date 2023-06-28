package p2_Divisor_thread;

import java.io.*;
import java.util.Scanner;

public class Div_Writer {
	FileWriter fw=null;
	public synchronized void writer (int div)
	{
		
		Scanner a=new Scanner(System.in);
		try
		{
			System.out.print("Enter file name : ");
			String fname=a.next();
			a.close();
			fw=new FileWriter("L:/myfiles/"+fname,true);
			fw.write(div);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}




/*package p2_Divisor_thread;

import java.io.*;
import java.util.Scanner;

public class Div_Writer {
				FileWriter fw=null;
				try
				{
					fw=new FileWriter("L:/myfiles/div23.txt");;
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
	public void writer(int div)
	{
		fw.write(div);
	}
}
}*/
