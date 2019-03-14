package JavaProgram8;

import java.util.Arrays;

public class SortingArrayDemo {

	public static void main(String[] args) {

		int[] arr={3,5,1,8,12,34,7,89,0,54};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length;j++){
				if(arr[j-1]>arr[j]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
