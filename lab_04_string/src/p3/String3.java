package p3;

public class String3 {
	public static void main(String[] args)
	{
	String s1="Welcome";
	for(int i=0;i<s1.length();i++)
	{
		int sh=s1.charAt(i);
		if(sh >= 65 && sh <=90 )
			{
				char sk=(char) (s1.charAt(i)+32);
				System.out.println(sk);
			}
		else
		{
			char sk=(char) (s1.charAt(i)-32);
			System.out.println(sk);
		}
	}
}
}