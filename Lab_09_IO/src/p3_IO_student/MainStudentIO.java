package p3_IO_student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainStudentIO {

	public static void main(String[] args) {
	BufferedReader b=null;
	try
		{
			b=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter roll no. : ");
			int rollno =Integer.parseInt(b.readLine());
			System.out.print("Enter name : ");
			String name=b.readLine();
			System.out.print("Enter Marks : ");
			int mark =Integer.parseInt(b.readLine());
			
			Student s1=new Student(rollno,name,mark);
			System.out.println(s1);
			System.out.println("Grade of Student = "+s1.calPercentage());
		}
	catch( IOException e)
		{
			System.out.println(e.getMessage());
		}

}
}
