package p12;
public class Student {
	private int rollNo;
	private String name;
	private static int noOfsub;
	//private Mark []mark;
	
	public Student() {
		//super();
	}
	/**
	 * @return the noOfsub
	 */
	public static int getNoOfsub() {
		return noOfsub;
	}

	public Student(int rollNo, String name, int noOfsub) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.noOfsub = noOfsub;
		//this.mark[] = new Mark()
	}
	

	public void display()
	{
		System.out.println("Roll no = "+rollNo);
		System.out.println("Name of Student = "+name);
		System.out.println("Number of student = "+noOfsub);
		//System.out.println("Roll no = "+rollNo);
		
	}
	
}
