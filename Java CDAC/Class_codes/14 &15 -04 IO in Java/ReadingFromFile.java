package iodemos;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class ReadingFromFile {

	public static void main(String[] args) throws IOException 
	{
		/*InputStream i = new FileInputStream("D:\\myfiles\\data.txt");
		/*int n; 
		while( (n = i.read()) != -1 )
			System.out.println((char)n);
		
		int n;
		byte [] arr = new byte[10];
		while( (n = i.read(arr)) != -1 )
			System.out.println(new String(arr));
		i.close();
		*/
		Reader r = new FileReader("D:\\myfiles\\data.txt");
		/*int n; 
		while( (n = r.read()) != -1 )
			System.out.println((char)n);
		*/
		int n;
		char [] arr = new char[12];
		while( (n = r.read(arr)) != -1 )
			System.out.println(new String(arr));
		r.close();
	}

}
