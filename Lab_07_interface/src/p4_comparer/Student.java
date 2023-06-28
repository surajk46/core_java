package p4_comparer;

public class Student {
	private int rollNo;
	private String name;
	private double mark;
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}

	public double getMark() {
		return mark;
	}

	public Student() {
		super();
		this.rollNo = 0;
		this.name = "";
		this.mark = 0;
	}

	public Student(int rollNo, String name, double mark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}
	public String toString()
	{
		return "Roll Number = "+rollNo+"\nName = "+name+"\nMark = "+mark ;
	}
	
}
