public class Pattern4
{
	public static void main(String [] ar)
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			//for Spaces
			for(int x=1;x<=n-i;x++)
			{
				System.out.print(" ");
			}
			//for *
			for(int y=1;y<=i;y++)
			{
				System.out.print("* ");
			}	

			System.out.println();
		}
	}
}