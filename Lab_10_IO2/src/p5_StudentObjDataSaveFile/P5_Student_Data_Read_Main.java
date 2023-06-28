package p5_StudentObjDataSaveFile;

import java.io.*;

public class P5_Student_Data_Read_Main {

	public static void main(String[] args) throws FileNotFoundException, IOException,Exception {
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("L:\\myfiles\\stddata.txt"));
		Student []empty=new Student [3];
		for(int i=0;i<empty.length;i++)
		{
			empty [i]=(Student) ois.readObject();
			System.out.println(empty[i]);
		}
	}

}
