package JavaProgram;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateBtwnList {

	public static void main(String[] args) {

		List<String> list1=new ArrayList<String>();
		list1.add("abc");
		list1.add("xyz");
		list1.add("kji");
		list1.add("mkjn");
		list1.add("yuhg");
		
		List<String> list2=new ArrayList<String>();
		list2.add("abc");
		list2.add("xyz");
		list2.add("yuhg");
		list2.add("ijo");
		list2.add("wer");
		
		for(String s:list1){
			if(list2.contains(s))
				System.out.println("Duplicate :"+s);
		}
	}

}
