package p5_StudentObjDataSaveFile;

import java.io.Serializable;

public class Date  implements Serializable{
	private int dd;
	private int mm;
	private int yy;
	
	public Date()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	public Date(int dd,int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public   String toString() 
	{
		return " DD = "+dd+"  mm = "+mm+"  yy = "+yy;
	}
	public void display()
	{
		System.out.println("\nDD = "+dd+"\nmm = "+mm+"\nyy = "+yy+ "\n");
	}
	
}
