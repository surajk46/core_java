package p6;

import java.io.*;
import java.util.Calendar;

public class Student extends Person{
	private Cource cource ;
	private String prn;
	private transient int age; 
	
	
	public Student() {
		super();
		cource=new Cource();
		prn="";
		age=0;
	}

	public Student(String name, int d,int m,int y, Cource cource, String prn, int age) {
		super(name, d,m,y);
		this.cource = cource;
		this.prn = prn;
		this.age = age;
	}

	public Student(String name, int d,int m,int y, int courceId, String courceName, double fee, String prn, int age) {
		super(name, d,m,y);
		this.cource = new Cource(courceId,courceName,fee);
		this.prn = prn;
		this.age = age;
	}

	
	public int CalculateYear()
	{
		int y=Calendar.getInstance().get(Calendar.YEAR)-super.getYy();
		return y;
	}
	@Override
	public String toString() {
		return super.toString()+"" + cource + "\nStudent prn = " + prn +"\nAge = "+CalculateYear();
	}

	
}
