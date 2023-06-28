public class pattern2
{
	public static void main(String [] ar)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			// for Spaces
			for(int x=1;x<=n-i;x++)
			{
				System.out.print(" ");
			}
			// for Numbers
			for(int y=1;y<=i;y++)
			{
				System.out.print(y);
			}
			// for next numbers
			for(int z=i-1;z>=1;z--)
			{
				System.out.print(z);	
			}
			System.out.println();
		}
		
	}
}