package p5_stringOperations;

public class Strings implements StringOperations {

	@Override
	public void reverse(String str) {
		for(int i=length(str)-1;i>=0;i--) 
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

	@Override
	public void toUpperCase(String str) {
		for(int i=length(str)-1;i>=0;i--) 
		{
			char j=(char) (str.charAt(i)-32);
			System.out.print(j);
		}
		System.out.println();
	}

	@Override
	public int length(String str) {
		int i=0;
		try {
			while(str.charAt(i)!='\0')
			{
					i++;
			}
		} catch (Exception e) {
			
		}
		
		return i;
	}

	@Override
	public boolean isPallindrome(String str) {
		boolean f=true;
		int end=(length(str)/2)+1;
		int e=length(str)-1;
		for(int i=0;i<end;i++) 
		{
			if(str.charAt(i)!=str.charAt(e-i))
			{
				f=false;
				break;
			}
		}
		return f;
	}

	@Override
	public String append(String str1, String str2) {
//	    char c;
//		int l=length(str1)+length(str2);
//		for(int i=0;i<str2.length();i++)
//		{
//			c=str2.charAt(i);
//			str1=str1+c;
//		}
//			return str1;
		return null;
	}
	
}
