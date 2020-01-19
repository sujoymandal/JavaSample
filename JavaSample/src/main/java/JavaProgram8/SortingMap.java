package JavaProgram8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMap {

	public static void main(String[] args) {

		Map<Integer,String> hMap=new HashMap<Integer,String>();
		hMap.put(34, "hju");
		hMap.put(78, "iuy");
		hMap.put(23, "frt");
		hMap.put(4, "ret");
		
		System.out.println(hMap);
		
		Map<Integer,String> tMap=new TreeMap<Integer,String>(hMap);
		System.out.println(tMap);
		
		//Sorting map based on values
		
	
	}


}
