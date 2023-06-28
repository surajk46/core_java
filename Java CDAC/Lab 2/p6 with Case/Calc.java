import java.util.Scanner;
class Calc
{
	//DATA MEMBERS
	private int no1;
	private int no2;
	private int ch;

	
	//Constructors
	public Calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter value of no1 = ");
		no1=sc.nextInt();
		System.out.printf("Enter Value of no2 =");
		no2=sc.nextInt();
		System.out.printf("Enter 1 : Addition\n");
		System.out.printf("Enter 2 : substraction\n");
		System.out.printf("Enter 3 : Multiplication\n");
		System.out.printf("Enter 4 : Division\n");
		ch=sc.nextInt();
			
	}

	// MEMBER FUNTION

	public void calc()
	{
		switch(ch)
		{
			case 1:
				System.out.printf("Addition of %d and %d is = %d \n",no1,no2,no1+no2);
				break;
			case 2:
				System.out.printf("Substraction of %d and %d is = %d \n",no1,no2,no1-no2);
				break;
			case 3:
				System.out.printf("Multiplication of %d and %d is = %d \n",no1,no2,no1*no2);
				break;
			case 4:
				System.out.printf("Divisition of %d WRT %d is = %d \n",no1,no2,no1/no2);
				break;
			default :
				System.out.printf("WRONG INPUT");
				break;
		}
	}

	
}
