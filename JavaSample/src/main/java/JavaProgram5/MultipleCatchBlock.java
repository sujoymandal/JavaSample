package JavaProgram5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		System.out.println("enter a number!!");
		Scanner sc=new Scanner(System.in);
		
		try {
			int i=sc.nextInt();
			System.out.println(99/i);
			
		} catch (InputMismatchException|ArithmeticException e) {
			
			System.out.println(e.getMessage());
			
		}
		sc.close();
	}

}
