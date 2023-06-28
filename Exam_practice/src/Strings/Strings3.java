package Strings;

public class Strings3 {

	public static void main(String[] args) {
		String s1="akshayKAadam";
		String s2 = s1.toUpperCase();		
		char [] arr = s2.toCharArray();
		char c;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					{
						count++;
						arr[j]=0;
					}
			}
			if(count>=0&&arr[i]!=0)
			System.out.println(arr[i]+" = "+count);

		}
	}

}
