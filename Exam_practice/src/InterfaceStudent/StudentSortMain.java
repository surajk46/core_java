package InterfaceStudent;

import java.util.Scanner;


interface Comparer
{
	public int comparer(Object o1,Object o2);
}
class Student
{
	private int prn;
	private String name;
	private float mark;
	
	public int getPrn() {
		return prn;
	}
	
	public String getName() {
		return name;
	}
	
	public float getMark() {
		return mark;
	}
	public Student() {
		super();
		this.prn = 0;
		this.name = "";
		this.mark = 0;
	}
	public Student(int prn, String name, float mark) {
		super();
		this.prn = prn;
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "\nStudent prn=" + prn + "\nname=" + name + "\nmark=" + mark;
	}
	
}
class RollComparer implements Comparer
{

	@Override
	public int comparer(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
		return s1.getPrn()-s2.getPrn();
	}
	
}

class NameComparer implements Comparer
{

	@Override
	public int comparer(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
		return (s1.getName().compareTo(s2.getName()));
	}
	
}

class MarkComparer implements Comparer
{

	@Override
	public int comparer(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
		return (int)(s1.getMark()-s2.getMark());
	}
	
}
public class StudentSortMain {
	public static void main(String[] args) {
		
		
		Student []arr= {(new Student(52,"saurabh",88)),
						(new Student(35,"abhinav",75)),
						(new Student(45,"nishnat",92))};
		System.out.println("enter 1 for roll compare ");
		System.out.println("enter 2 for name compare ");
		System.out.println("enter 3 for mark compare ");
		Comparer c=null;
		Scanner a=new Scanner(System.in);
		byte n=a.nextByte();
		if(n==1)
		{
			c=new RollComparer();
		}
		if(n==2)
		{
			c=new NameComparer();
		}
		if(n==3)
		{
			c=new MarkComparer();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			//for(int j=i+1;j<arr.length;j++)
			//{
			int d=c.comparer(arr[i],arr[i+1]);
				if(d>0)
				{
					Student temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
			//}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			System.out.println("*********************************");
		}
	}
}
