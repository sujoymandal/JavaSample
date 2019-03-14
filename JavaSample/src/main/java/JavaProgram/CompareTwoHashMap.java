package JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareTwoHashMap {

	public static void main(String[] args) {

		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "a");
		map1.put(2, "b");
		map1.put(3, "c");
		map1.put(4, "d");
		
		Map<Integer,String> map2=new HashMap<Integer,String>();
		map2.put(1, "x");
		map2.put(2, "y");
		map2.put(3, "z");
		map2.put(4, "d");
		
		
		Map<Integer,String> map3=new HashMap<Integer,String>();
		map3.put(4, "a");
		map3.put(5, "b");
		map3.put(6, "c");
		map3.put(7, "d");
		
		System.out.println("Comparing key nad values of both maps..");
		System.out.println(map1.equals(map3));
		
		System.out.println("comparing only keys..");
		System.out.println(map1.keySet().equals(map2.keySet()));
		
		System.out.println("Comparing only values..");

		List<String> list1=new ArrayList<String>(map1.values());
		List<String> list2=new ArrayList<String>(map2.values());
		List<String> list3=new ArrayList<String>(map3.values());
		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(new ArrayList<String>(map3.values())));
		System.out.println(list1.equals(list3));
		System.out.println(list1);
		System.out.println(list3);
	}

}
