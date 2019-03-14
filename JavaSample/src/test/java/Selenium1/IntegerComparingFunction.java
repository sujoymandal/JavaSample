package Selenium1;

public class IntegerComparingFunction {

	public static void main(String[] args) {

		Integer i=new Integer(5);
		Integer j=new Integer(8);
		Integer k=new Integer(5);
		System.out.println(i.compareTo(j));
		System.out.println(Integer.compare(i, j));
		System.out.println(Integer.compare(j, i));
		System.out.println(i.compareTo(k));
		System.out.println(Integer.compare(i, k));
		
	}

}
