public class Sumofdig
{
	public static void main(String [] ar)
	{
		int n=653;
		int p,sum=0;
		int num=n;
		while(n>0)
		{
			p=n%10;
			sum+=p;
			n/=10;
		}
		System.out.printf("Sum of Digit of %d = %d",num,sum);
	}
}