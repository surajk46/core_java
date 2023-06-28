public class Pattern5
{
	public static void main(String [] ar)
	{
		int n=10,c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c+=1;

			}
			System.out.println();
		}
		
	}
}