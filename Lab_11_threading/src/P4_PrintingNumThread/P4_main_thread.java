package P4_PrintingNumThread;

import java.io.*;
import java.util.Scanner;

public class P4_main_thread {

	public static void main(String[] args) throws Exception{
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner s=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int n;
		n=s.nextInt();
		
		p4_Runnable [] arr= {new p4_Runnable(n),new p4_Runnable(n),new p4_Runnable(n)};
		
		//p4_Runnable r=new p4_Runnable(n);
		//r.getT().start();
		for(int i=0;i<arr.length;i++)
		{
			arr[i].getT().start();
		}
		
	}

}
