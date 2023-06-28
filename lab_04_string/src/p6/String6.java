package p6;

public class String6 {
	public static void main(String[] args){
		String s1="Welcome&)^*(%(&";
		int alpha=0,small=0,sp=0;
		for(int i=0;i<s1.length();i++)
		{
			int sh=s1.charAt(i);
			if((sh >= 65 && sh <=90))
			{
				alpha++;
			}
			else if(sh >= 97 && sh <=122)
			{
				small++;
			}
			else
			{
				sp++;
			}
		}
		if(alpha==0)
			System.out.println("Capital Alphabet is Mising.");
		else
			System.out.println("Capital Alphabet is Available");
		if(small==0)
			System.out.println("Small Alphabet is Mising.");
		else
			System.out.println("Small Alphabet is Available");
		if(sp==0)
			System.out.println("Special Character is Mising.");
		else
			System.out.println("Capital Alphabet is Available");
		
	}
}
