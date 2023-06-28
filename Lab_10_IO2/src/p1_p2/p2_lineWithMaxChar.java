package p1_p2;

import java.io.*;

public class p2_lineWithMaxChar {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter File Name : ");
		String fname=br.readLine();
		
		//FileReader f1=new FileReader("L:/myfiles/"+fname);
		BufferedReader b=new BufferedReader(new FileReader("L:/myfiles/"+fname));
		int n=0,max=0,index=0,count=1;
		String maxLine="";
		String line="";
		while((line=b.readLine())!=null)
		{
			count++;
			//System.out.println(count+"."+line);
			if(max<line.length())
			{
				max=line.length();
				maxLine=line;
				index=count;
			}
		}
		
		System.out.println("\n\n************************\n\n"+index+"   "+maxLine);
	}
}
