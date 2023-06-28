package countCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		String a="coccacola";
		char ch;
		Map<Character, Integer> m=new HashMap<>();
//		for(int i=0;i<a.length();i++)
//		{
//			ch=a.charAt(i);
//			int count=0;
//			for(int j=0;j<a.length();j++)
//			{
//				if(ch==a.charAt(j))
//					count++;
//			}
//			m.put(ch, count);
//		}
		
		for(int i=0;i<a.length();i++)
		{
			ch=a.charAt(i);
			if(m.containsKey(ch))
				m.put(ch, m.get(ch)+1);
			else
				m.put(ch,1);
		}
		Set<Map.Entry<Character, Integer>> s=m.entrySet();
		for(Map.Entry<Character, Integer> set:s)
			System.out.println(set);
	}
}
