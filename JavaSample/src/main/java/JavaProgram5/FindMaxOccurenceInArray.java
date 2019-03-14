package JavaProgram5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMaxOccurenceInArray {

	public static void main(String[] args) {

		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		List<Integer> list=new ArrayList<Integer>();
		int[] arr={1,2,1,2,3,4,3,5,6,8,5,5,5,89};
		
		for(int i:arr){
			if(map.keySet().contains(i)){
				map.put(i, map.get(i)+1);
			}
			else
				map.put(i, 1);
		}
		Integer r=Collections.max(map.entrySet(),(entry1,entry2)->entry1.getValue()-entry2.getValue()).getKey();
		System.out.println(r);
		
	
	}

}
