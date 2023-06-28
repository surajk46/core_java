package p6_primeNoInRange_thread;

import java.io.*;
import java.util.Scanner;

public class P6_prime_Thread_Main {

	public static void main(String[] args) {
//		BufferedReader br=null;
		try
		{
//			br=new BufferedReader(new InputStreamReader(System.in));
//			System.out.print("Enter 2 Numbers : ");
//			int n1=br.read();
//			int n2=br.read();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter 2 Numbers : ");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			P6_Runnable r=new P6_Runnable(n1,n2);
			r.getT().start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				//br.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		
		
	}

}
