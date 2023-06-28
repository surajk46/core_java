package p4_file_IO;

import java.io.*;

public class P5_FileCopy_IO {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter File1 Name : ");
		String fname1 = br.readLine();
		
		System.out.print("Enter File1 Name : ");
		String fname2 = br.readLine();
		
		OutputStream o =new FileOutputStream("L:\\myfiles"+fname2);    //output writing
		InputStream i =new FileInputStream("L:\\myfiles"+fname1);		//input reading
		int n ;
		while((n=i.read())!=-1)
		{
			//char ch = (char) n;
			//String ch=(String)n;		//error
			o.write(n);
			System.out.print((char)n);
		}
	}

}
