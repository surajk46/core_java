package p5_practice;

public class Stringss implements StringOperations{

	@Override
	public void reverse(String str) {
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

	@Override
	public void toUpperCase(String str) {
		// TODO Auto-generated method stub
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			if(ch > 'a' && ch <= 'z')
			{
				ch= (char) (ch-32);
			System.out.print(ch);
			}
		}
		System.out.println();
	}

	@Override
	public int length(String str) {
	int i=0;
		try
		{
			while(str.charAt(i)!='\0')
			{
				i++;
			}
		}
		catch(Exception e)
		{
			
		}
		return i;
	}

	@Override
	public boolean isPallindrome(String str) {
		// TODO Auto-generated method stub
		boolean f=true;
		int c=str.length()-1;
		for(int i=0;i<c/2;i++)
		{
			if(str.charAt(i)!=str.charAt(c-i))
			{
				f=false;
				break;
			}
		}
		return f;
	}

	@Override
	public String append(String str1, String str2) {
		// TODO Auto-generated method stub
		for(int i=0;i<str2.length();i++)
		{
			char ch=str2.charAt(i);
			str1=str1+ch;
		}
		return str1;
	}
	
	
}
