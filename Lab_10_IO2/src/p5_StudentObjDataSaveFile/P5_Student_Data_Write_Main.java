package p5_StudentObjDataSaveFile;

import java.io.*;

public class P5_Student_Data_Write_Main{
	public static void main(String[] args)throws Exception {
		Student []arr= { new Student("surj",4,6,2000,1001,"Cdac",100000,"20050",23),
						 new Student("rupesh",4,6,2000,1001,"Cdac",100000,"20050",23),
						 new Student("abhinav",4,5,1999,1001,"Cdac",100000,"20055",25)};
		
		ObjectOutputStream ois=new ObjectOutputStream(new FileOutputStream("L:\\myfiles\\stddata.txt"));
	//	FileReader fr=new FileReader("L:\\myfiles\\stddata.txt");
		int n;
		for(int i=0;i<arr.length;i++)
		{
			ois.writeObject(arr[i]);;
		}
		System.out.println("Student Data successfully save in file ");
		
	}
}
