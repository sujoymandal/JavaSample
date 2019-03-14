package JavaProgram;

import java.util.Scanner;

public class StringConvertUpperAndLowerAlternate {

	public static void main(String[] args) {

		System.out.println("enter string..");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		sc.close();
		String[] arr=input.split("");
		String output="";
		String s=null;
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				s=arr[i].toUpperCase();
			}
			else
				s=arr[i].toLowerCase();
			output=output+s;
		}
		
		System.out.println(output);
	}

}
