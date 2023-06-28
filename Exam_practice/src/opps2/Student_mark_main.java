package opps2;

import java.util.*;

class Student 
{
	private int rollNo;
	private String name;
	private static int noOfSub;

	public Student() 
	{
		super();
		this.rollNo = 0;
		this.name = "";
		this.noOfSub = 0;
	}

	public Student(int rollNo, String name, int noOfSub)
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.noOfSub = noOfSub;
	}

	public static int getNoOfSub()
	{
		return noOfSub;
	}

	@Override
	public String toString()
	{
		return "Student rollNo = " + rollNo + "\nStudent Name = " + name + "\nStudent noOfSub = " + noOfSub;
	}

}

class Mark 
{
	private int []mark;
	public void suraj()
    {
	  int c = Student.getNoOfSub();
	  mark=new int[c];
	  Scanner sc= new Scanner(System.in);
	  for(int i=0;i<c;i++)
	  {
		  System.out.println("enter the mark of sub "+(i+1)+" = ");
		  mark[i] = sc.nextInt();
	  }
	sc.close();
	  for(int i=0;i<2;i++)
		  System.out.println("mark = "+mark[i]);
    }
}

public class Student_mark_main
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Suraj",2);
		Mark m = new Mark();
		System.out.println(s1);
		m.suraj();
	}
}
