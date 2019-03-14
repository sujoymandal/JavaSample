package JavaProgarm4;

public class StringImmutableDemo {

	public static void main(String[] args) {

		String s1="hello";
		s1.concat("world");//will not change the s1 reference
		System.out.println(s1);
		System.out.println(s1.concat("world"));//printing the new created object's value
		s1="hello world";
		System.out.println(s1);
		
		String s2=s1.concat("world");//will create new string object
		System.out.println(s2);
	}

}
