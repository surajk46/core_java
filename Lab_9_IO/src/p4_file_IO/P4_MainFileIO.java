package p4_file_IO;

import java.io.*;


public class P4_MainFileIO {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter File Name : ");
		String fname=br.readLine();
		OutputStream o=new FileOutputStream("L:\\myfiles"+fname);		//for writing
		InputStream i=new FileInputStream("L:\\myfiles"+fname);			//for Reading
		
		
		String line="";
		System.out.println("Enter \"stop\" to QUIT");
		while(!((line=br.readLine()).equalsIgnoreCase("stop")))
		{
			line=line+"\n";
			o.write(line.getBytes());
			//System.out.println();
		}
		int n=0;
		while((n=i.read())!=-1)
		{
			System.out.print((char)n);
		}
	}

}
