package JavaProgarm4;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> s1=new Stack<Integer>();
		s1.add(4);
		s1.add(8);
		s1.add(9);
		s1.add(7);
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}

}
