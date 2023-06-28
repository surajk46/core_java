import java.util.Scanner;
class Student
{
	// data members
	private int id;
	private float percentage;


	// Constructor
	//public Student()
	//{
		
	//}
	
	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Id = ");
		id = sc.nextInt();
		System.out.print("Enter Student Percentage = ");
		percentage = sc.nextFloat();
	}

	//Member function
	public void result()
	{
		if(percentage>=90)
			System.out.println("Exellent Grade");
		else if(percentage>=80)
			System.out.println("Very Good Grade");
		else if(percentage>=70)
			System.out.println("Good Grade");
		else if(percentage>=60)
			System.out.println("Average Grade");
		else if(percentage>=40)
			System.out.println("Pass Grade");
		else
			System.out.println("Fail");
	}
}