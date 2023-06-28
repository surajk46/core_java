public class ReverseNo
{
	public static void main(String [] ar)
	{
		int n=156;
		int rev=0,rem;
		int nc=n;
		while(n>0)
		{
		rem=n%10;
		rev=rev*10+rem;
		n/=10;
		}
		System.out.println("Reverce of "+nc+" = "+rev);
	}
}