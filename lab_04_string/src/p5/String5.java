package p5;

public class String5 {
	public static void main(String[] args){
	String s1="Welcome&)^*(%(&";
	int count =0;
	for(int i=0;i<s1.length();i++)
	{
		int sh=s1.charAt(i);
		if((sh >= 65 && sh <=90) || (sh >= 97 && sh <=122))
		{}
		else
		{
			System.out.println(s1.charAt(i));
			count++;
		}
	}
	System.out.println("Count of Special character = "+count);
}
}
