package office.staff;

public class EmpDemo
{

	public static void main(String[] args)
	{
		Emp [] allemp = new Emp[3];
		allemp [0] =new SalesManager("Shri", 29, 8, 1999, 12, 20000, 100, 24);
		allemp [1] =new Programmer("Suraj", 29, 3, 2000, 11, 30000, 20, 700);
		allemp [2] =new Admin("Shivam", 27, 5, 1997, 10, 70000, 50000);
//		print salary of every employee
		for(int i=0;i<allemp.length;i++)
		{
			allemp[i].calSalary();
			System.out.println();
		}
		
//		print only details of emp having max salary
//		double max=allemp[0].calSalary();
//		int index=0;
//		for(int i=0;i<allemp.length;i++)
//		{
//			if(allemp[i].calSalary()>max)
//				index=i;
//		}
//		System.out.println(allemp[index]);
		
		
		
//		for(int i=0;i<allemp.length;i++)
//		{
//			System.out.println("Employee having Id = "+allemp[i].getEmpid()+" Having salary = "+allemp[i].calSalary() );
//		}
	}
	
}
