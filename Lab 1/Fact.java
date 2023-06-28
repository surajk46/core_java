import java.util.*;
public class Fact
{
	public static void main(String [] ar)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			

			fact=fact*i; 
			
		}
		System.out.print("factorial of "+n+" = "+fact);
	}
}