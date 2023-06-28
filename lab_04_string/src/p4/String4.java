package p4;

public class String4 {
	public static void main(String [] a)
	{
		String s1="Welcome";
		int vo=0,co=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o'|| s1.charAt(i)=='u' || s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O'|| s1.charAt(i)=='U')
				vo++;
			else
				co++;
		}
		System.out.println("Number of Vowels = "+vo);
		System.out.println("Number of Consonent = "+co);
	}
}
