package p3_EmpReadWrite;

import java.io.*;

public class p4_lineWithDot  {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("L:/myfiles/f1.txt"));
		int n=0,max=0;
		String line="";
		String maxLine="";
		while((line=br.readLine())!=null)
		{
			if(max<line.length())
			{
				max=line.length();
				maxLine=line;
			}
		}
		br.close();
		br=new BufferedReader(new FileReader("L:/myfiles/f1.txt"));
		String line2="";
		while((line2=br.readLine())!=null)
		{
			int c=(max-line2.length());
			for(int i=1;i<=c;i++)
			{
				System.out.print(".");
			}
			System.out.println(line2);
		}
		System.out.println(maxLine);

	}

}
