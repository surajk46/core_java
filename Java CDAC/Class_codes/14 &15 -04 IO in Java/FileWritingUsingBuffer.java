package iodemos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWritingUsingBuffer {

	public static void main(String[] args) throws Exception
	{
		File f = new File("D:/myfiles/buffer.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line ;
		System.out.println("Enter 'stop' to quit");
		while( !((line = br.readLine()).equals("stop")))
		{
			bw.write(line);
			bw.newLine();
		}
		bw.flush();
		bw.close();  //automatically flushes
		br.close();
	}

}
