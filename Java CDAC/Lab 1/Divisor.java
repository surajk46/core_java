public class Divisor
{
	public static void main(String [] ar)
	{
		int n=15;
		System.out.print(" Divisors Of "+n+"are = ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+ " ");
			}

		}
	}
}