package p4_file_IO;
import java.io.*;


public class Examp1 {

	public static void main(String[] args) throws IOException {
		//accept file name from user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file name : ");
		String fname = br.readLine();
		
		//check id directory or file
		File f = new File(fname);
		if(f.isDirectory())
		{
			//list content of directory
			File [] files = f.listFiles();
			for(File f1 : files)
				System.out.println(f1);
			
		}
		else if (f.isFile())
		{
			int n;
			//read with buffer
			if(f.length() > 10)
			{
				
				BufferedReader br1 = new BufferedReader(new FileReader(f));
				while(( n= br1.read()) != -1)
					System.out.println((char)n);
			}
			else
			{
				//read with FileReader as file size is less
				FileReader fr = new FileReader(f);
				while(( n= fr.read()) != -1)
					System.out.println((char)n);
				
			}				
		}
	}
}
		
		
		
		