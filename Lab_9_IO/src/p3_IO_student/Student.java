package p3_IO_student;

public class Student {
	private int rollno;
	private String name;
	private int marks;
	
	
	public Student() {
		super();
		this.rollno = 0;
		this.name = "";
		this.marks = 0;
	}


	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}


	public String toString() {
		return "Student rollno = " + rollno + "\nStudent name =  "+ name + "\nStudent marks = " + marks;
	}
	public char calPercentage()
	{
		char ch;
		if(marks>90)
			ch='A';
		else if(marks>80)
			ch='B';
		else if(marks>70)
			ch='C';
		else if(marks>60)
			ch='D';
		else if(marks>40)
			ch='E';
		else
			ch='F';
		return ch;
		
	}
	
}
