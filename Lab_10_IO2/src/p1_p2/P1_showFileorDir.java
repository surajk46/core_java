package p1_p2;

import java.io.*;

public class P1_showFileorDir {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file path");
		String shivam=br.readLine();
		File f= new File("L:/myfiles/"+shivam);
		if(f.isDirectory())
		{
			File [] files =f.listFiles();
			for(File f1 : files)
			{
				System.out.println(f1);
			}
		}
		else if(f.isFile())
		{
			if(f.length()>10)
			{
				BufferedReader b=new BufferedReader(new FileReader(f));
				int n;
				while((n=b.read())!=-1)
					System.out.print((char)n);
			}
			else
			{
				FileReader f2=new FileReader(f);
				int n;
				while((n=f2.read())!=-1)
					System.out.print((char)n);
			}
		}
		
	}
}
