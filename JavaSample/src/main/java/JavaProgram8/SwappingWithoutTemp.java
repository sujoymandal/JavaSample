package JavaProgram8;

import java.util.Scanner;

public class SwappingWithoutTemp {

	public static void main(String[] args) {

		System.out.println("Enter first number..");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("Enter second number..");
		int j=sc.nextInt();
		System.out.println("i= "+i+" and j= "+j);
		
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println("i= "+i+" and j= "+j);
	}

}
