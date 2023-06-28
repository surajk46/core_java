package P5_Thread_copy;

import java.io.*;

public class P5_main_thread {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Source File Path : L:/myfiles/");
		String source=br.readLine();
		System.out.print("Enter Destination File Path : L:/myfiles/");
		String destination=br.readLine();
		
		P5_Runnable r=new P5_Runnable(source,destination);
	
		r.getT().start();

		
	}

}
