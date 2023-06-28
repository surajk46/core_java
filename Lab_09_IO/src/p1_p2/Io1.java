package p1_p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Io1 {
	public static void main(String[] args) {
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" enter \"q\" to quite ");
			int n=0,a=0,d=0;
			int count=0;
			while((n=br.read())!='q')
			{
				char ch=(char)n;
					if(Character.isAlphabetic(ch))
						{a++;}
					if(Character.isDigit(ch))
						{d++;}
				count++;
				System.out.println(ch);
			}
			System.out.println("count of letter : "+count);
			System.out.println("Number of Alphabet : "+a);
			System.out.println("Number of digit : "+d);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(IOException e)
			{
				e.getStackTrace();
			}
		}
	}
}
