package JavaProgram;

import java.util.Arrays;

public class SortingStringDemo1 {

	public static void main(String[] args) {

		String unsorted="greadcfbsh";
		char[] arr=unsorted.toCharArray();
		Arrays.sort(arr);
		String sorted=new String(arr);
		System.out.println(sorted);
		
	}

}
