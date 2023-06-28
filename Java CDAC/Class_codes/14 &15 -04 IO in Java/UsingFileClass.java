package iodemos;

import java.io.File;
import java.util.Date;

public class UsingFileClass {

	public static void main(String[] args)
	{
		File f= new File("D:/myfiles/data.txt");
		System.out.println("Exists : "+f.exists());
		System.out.println("is directory : "+f.isDirectory());
		System.out.println("is file : "+f.isFile());
		System.out.println("readable : "+f.canRead());
		System.out.println("executable : "+f.canExecute());
		System.out.println("Size : "+f.length());
		Date d = new Date(f.lastModified());
		System.out.println("last modified time : "+d);
		
		
		File f1 = new File("D:/javaprogs");
		if(f1.isDirectory())
		{
			System.out.println("Directory contents : ");
			File [] files = f1.listFiles();
			for( File file : files )
			{
				if(file.isDirectory())
				{
					File [] files1 = file.listFiles();
					for( File file1 : files1  )
					{
						System.out.println("....."+file1.getName());
					}
				}
				else if(file.isFile())
					System.out.println(file.getName());
			}
				
		}
		
	}

}
