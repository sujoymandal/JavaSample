package JavaProgram5;

import java.util.Arrays;
import java.util.Scanner;

public class SortingStringAlphabatically {

	public static void main(String[] args) {

		String temp;
		System.out.println("enther the string ");
		String[] arr=new String[4];
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i<4){
			arr[i]=sc.nextLine();
			i++;
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
		
		for(int j=0;j<4;j++){
			for(int k=1;k<4;k++){
				if(arr[k].compareTo(arr[k-1])>0){
					temp=arr[k];
					arr[k]=arr[k-1];
					arr[k-1]=temp;
			}
		}
	}
		System.out.println(Arrays.toString(arr));
	}
}
