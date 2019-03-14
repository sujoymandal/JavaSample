package JavaProgram7;

public class SwappingString {

	public static void main(String[] args) {

		String a="abc";
		String b="xyz";
		
		a=a+b;
		b=a.substring(0,(a.length()-b.length()));
		a=a.substring(b.length(),a.length());
		System.out.println(a+" and "+b);
	}

}
