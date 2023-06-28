package abstractClass;

import java.util.Arrays;
import java.util.Scanner;

class Student
{
	private int prn;
	private String name;
	
	public Student() {
		super();
		this.prn = 0;
		this.name ="";
	}

	public Student(int prn, String name) {
		super();
		this.prn = prn;
		this.name = name;
	}
	
}
class CdacStudent extends Student
{
	private static String []a;
	private int []mark=new int [8];
	static
	{
		a=new String [8];
		a[0]="Python and R Programming";
		a[1]="Object Oriented Programming with Java";
		a[2]="Advanced Analytics using Statistics";
		a[3]="Data Collection & DBMS ";
		a[4]="Big Data Technologies";
		a[5]="Data Visualization ";
		a[6]="Practical Machine Learning";
		a[7]="Aptitude and Effective communication";
	}
	public CdacStudent(int[] mark) {
		super();
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "CdacStudent [mark=" + Arrays.toString(mark) + "]";
	}

	
	
}
class DbdaStudent extends Student
{
	private static String []a;
	private int []mark=new int [6];
	static
	{
		a=new String [6];
		a[0]="Object Oriented Programming with Java";
		a[1]="Algorithms and Data Structures Using Java";
		a[2]="Database Technologies";
		a[3]="Web Programming Technologies";
		a[4]="Big Data Technologies";
		a[5]="Web-based Java Programming";
		a[6]="Aptitude and Effective communication";
	}
	public DbdaStudent(int[] mark) {
		super();
		this.mark = mark;
	}
}
public class StudentMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] mark = new int[6]; 
		for(int i=0;i<mark.length;i++)
		{
			System.out.println("Enter mark of 6 subject : ");
			mark[i]=sc.nextInt();
		}
		Student s1 = new CdacStudent(mark);
		System.out.println(s1);
		
	}

}
