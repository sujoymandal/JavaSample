package JavaProgram7;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {

		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "a");
		m1.put(2, "b");
		
		HashMap<Integer,String> m3=new HashMap<Integer,String>();
		m3.put(3, "x");
		m3.put(4, "y");
		
		Map<Integer,HashMap<Integer,String>> map=new HashMap<Integer,HashMap<Integer,String>>();
		
		map.put(10, m1);
		map.put(20, m3);
		
		System.out.println(map.get(10).get(1));
		
		
	}

}
