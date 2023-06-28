public class Fibb
{
	public static void main(String [] ar)
	{
		int a=0,b=1,c;
		int n=10;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}