package JavaProgram;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {

		int[] arr={3,4,2,60,7,17,9,10,23,12,5};
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j-1]>arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
