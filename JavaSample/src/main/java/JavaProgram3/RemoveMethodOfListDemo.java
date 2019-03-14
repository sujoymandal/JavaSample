package JavaProgram3;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethodOfListDemo {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(23);
		list.add(23);
		list.add(45);
		list.add(78);
		list.add(90);
		Integer i=23;
		System.out.println(list);
		list.remove(i);//remove the first occurrence of 23
		System.out.println(list);
	}

}
