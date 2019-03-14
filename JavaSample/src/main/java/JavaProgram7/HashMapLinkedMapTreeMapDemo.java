package JavaProgram7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedMapTreeMapDemo {

	public static void main(String[] args) {

		Map<Integer,String> hMap=new HashMap<Integer,String>();
		hMap.put(41, "D");
		hMap.put(32, "C");
		hMap.put(11, "A");
		hMap.put(23, "B");
		
		System.out.println(hMap);
		
		Map<Integer,String> tMap=new  TreeMap<Integer,String>();
		tMap.putAll(hMap);
		System.out.println(tMap);
	}

}
