package JavaProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		int[] arr={1,3,4,5,8,12,34,1,5,1,3,3,3,78,4};
		List<Integer> list=new ArrayList<Integer>();
		Set<Integer> dup=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			if(!list.contains(arr[i]))
				list.add(arr[i]);
			else
				dup.add(arr[i]);
		}
		System.out.println("Duplicate elements are :"+dup);
	}

}
