public class Armstrong
{
	public static void main(String [] ar)
	{
		int n=37;
		int c=0;
		int nc=n;
		int ncc=n;
		while(n>0)
		{
			c++;
			n/=10;
		}
		int sum=0,rem;
		while(nc>0)
		{
			rem=nc%10;
			sum+=Math.pow(rem,c);
			nc/=10;
		}
		if (ncc==sum)
			System.out.println(ncc +" is a Armstrong Number");
	        else
			System.out.println(ncc +" is a Not Armstrong Number");
	}
}