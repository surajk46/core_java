package p9;

public class String9 {
	public static void main(String[] args){
	String s1="Welcome";
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		int count=0;
		for(int j=s1.length()-1;j>=0;j--)
		{
			if(ch==s1.charAt(j))
			{
				count++;
			}
		}
		if(count==1)
		System.out.println(s1.charAt(i)+" is occors "+count+" times");
	}

}
}
