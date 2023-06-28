package threaddemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileCopyDemo {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter source :");
		String source=br.readLine();
		System.out.println("Enter destination :");
		String destination=br.readLine();
		
		System.out.println("Starting filecopy operation");
		FileCopy f = new FileCopy(source, destination);
		f.getT().start();
		System.out.println("Filecopy operation completed");

	}

}
