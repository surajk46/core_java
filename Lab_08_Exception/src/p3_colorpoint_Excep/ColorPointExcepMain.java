package p3_colorpoint_Excep;

import java.util.Scanner;

public class ColorPointExcepMain {
	public static void main(String [] a)
	{
		Scanner sk=new Scanner(System.in);
		System.out.print("Enter Your Color : ");
		String color= sk.next();
		try {
			ColorPoint c1=new ColorPoint(color);
		} 
		catch (ColorNotMatchException e) {
			System.out.println(e.getMessage());
		}
		
	}
}