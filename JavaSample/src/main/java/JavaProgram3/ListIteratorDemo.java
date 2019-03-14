package JavaProgram3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("uyt");
		list.add("kji");
		
		ListIterator lt=list.listIterator();
		
		Iterator it=list.iterator();
		
		
	}

}
