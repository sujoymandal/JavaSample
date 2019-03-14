package JavaProgram5;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {

		int[] arr={3,5,4,8,1,32,56,43,9,90};
		
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length;j++){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	

}
