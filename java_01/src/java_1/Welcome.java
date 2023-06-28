package java_1;

public class Welcome {

	public static void main(String[] args) {
		String a="hello";
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
					{
						System.out.println(a.charAt(i));
					}
			}
		}

	}

}
