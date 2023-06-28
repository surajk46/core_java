public class Prime
{
	public static void main(String [] ar)
	{
		int n=15;
		boolean f=true;
		for(int i=2;i<n/2;i++)
		{
		if(n%i==0)
		{
			f=false;
			break;
		}
		}
		if(f==true)
		System.out.print(n+" is Prime Number");
		else
		System.out.print(n+" is not Number");
		
	}
}