package JavaProgram5;

import java.util.ArrayList;
import java.util.List;

public class RemoveZerosFromArray {

	public static void main(String[] args) {

		int[] arr={1,0,1,0,2,3,0,2,0,20,4,50,6,6,60,0,0};
		
		int[] arr2=new int[arr.length];
		
		int k=0;
		
		for(int j:arr){
			if(j!=0){
				arr2[k]=j;
				k++;
			}
		}
		for(int h=0;h<k;h++)
			System.out.println(arr2[h]);
		
		List<Integer> list=new ArrayList<Integer>();
		for(int i:arr){
			if(i!=0)
				list.add(i);
		}
		
		System.out.println(list);
	}

}
