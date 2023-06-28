public class Pattern3
{
	public static void main(String [] ar)
	{
		int n=5;
		for(int j=1;j<=n;j++)
		{
			for(int i=1;i<=n-j+1;i++)
			System.out.print(j+" ");
			System.out.println();
		}
		
	}
}