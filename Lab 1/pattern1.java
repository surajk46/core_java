public class pattern1
{
	public static void main(String [] arg)
	{
		
		for(int j=5;j>=1;j--)
		{
			for(int i=5;i>=j;i--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}