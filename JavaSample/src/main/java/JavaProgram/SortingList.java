package JavaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("def");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
