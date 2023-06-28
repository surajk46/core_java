package Strings;

import java.util.Iterator;

public class String2 {
	public static void main(String[] args) {
		String s1="ALkshay";
		
		for(int i=0;i<s1.length();i++)
		{
			int c=s1.charAt(i);
			if(c>=65 && c<=90)
			{
				c=((int)(s1.charAt(i))+32);
			}
		   if(c>=97 && c<=124)
		   {	c=s1.charAt(i)-32;}
			System.out.println((char)c);
		}
	}
}
