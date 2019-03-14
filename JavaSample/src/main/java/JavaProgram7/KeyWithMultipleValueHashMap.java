package JavaProgram7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyWithMultipleValueHashMap {

	public static void main(String[] args) {

		List<String> list1=new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		List<String> list2=new ArrayList<String>();
		list2.add("x");
		list2.add("y");
		list2.add("z");
		
		Map<Integer,List<String>> map=new HashMap<Integer,List<String>>();
		map.put(1,list1);
		map.put(2, list2);
		
		System.out.println(map.get(1));
	}

}
