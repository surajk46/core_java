package p3_iTraveller;

public class EmpDemo
{
	public static void main(String[] args)
	{
		Emp [] allemp = new Emp[3];
		allemp [0] =new SalesManager("Shri", 29, 8, 1999, 12, 20000, 100, 24,5);
		allemp [1] =new Programmer("Suraj", 29, 3, 2000, 11, 30000, 20, 700,5);
		allemp [2] =new Admin("Shivam", 27, 5, 1997, 10, 70000, 50000);
//		print salary of employee who is having travelling allowance
//		for(int i=0;i<allemp.length;i++)
//		{
//			if(allemp[i]instanceof ITraveller)
//			{
//				System.out.println(allemp[i]);
//				System.out.println("**************************************");
//			}
//		}
		
		for(int i=0;i<allemp.length;i++)
		{
			if(allemp[i]instanceof ITraveller)
			{
				// allemp[i] reference of Emp
				// 
				System.out.println("Travelling Allowance = "+((ITraveller)allemp[i]).calculateTA());
			}
		}

	}
	
}
