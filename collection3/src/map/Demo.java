package map;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<>();
		m.put(1,"Shiv");
		m.put(5,"Shivam");
		m.put(2,"Suraj");
		m.put(3,"Shiva");
		m.put(4,"Shivani");
		
		m.put(1,"Shivanjali");
		m.put(null,null);
		m.put(6,null);
		m.put(null,"kk");
		m.put(null,null);
		
		Set <Map.Entry<Integer, String>> s=m.entrySet();
		for(Map.Entry<Integer, String> set:s)
			System.out.println(set);
	}
}
