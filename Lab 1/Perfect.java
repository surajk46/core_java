public class Perfect
{
	public static void main(String [] ar)
	{
		int n=653;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			sum+=i;
			}
		}
		if(n==sum)
			System.out.print(n+" is a Perfect No");
		else
			System.out.print(n+" is a Not Perfect No");
	}
}