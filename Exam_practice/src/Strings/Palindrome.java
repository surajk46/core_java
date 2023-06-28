package Strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String a=c.next();
		c.close();
		int l=a.length();
		boolean f=true;
		for(int i=0;i<l/2;i++)
		{
			if(a.charAt(i)!=a.charAt(l-i-1))
			{
				f=false;
				break;
			}
		}
		if(f)
			System.out.println(a+" is palindrome ");
		else {
			System.out.println(a+" is NOT palindrome ");
		}
	}
}
