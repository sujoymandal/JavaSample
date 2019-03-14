package JavaProgram10;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodDemo {

	public static void main(String[] args) {

		List<String> std=new ArrayList<String>();
		std.add("abc");
		std.add("xyz");
		std.add("yut");
		std.forEach((s)->System.out.println(s));
		
		List<Integer> num=new ArrayList<Integer>();
		num.add(2);
		num.add(5);
		num.add(6);
		num.forEach((n)->System.out.println(n*n));
	}

}
