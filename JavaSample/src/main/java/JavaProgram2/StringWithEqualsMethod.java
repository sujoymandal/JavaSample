package JavaProgram2;

public class StringWithEqualsMethod {

	public static void main(String[] args) {

		String s1="test";
		String s2="test";
		String s3=new String("test");
		String s4="test1";
		String s5="best";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s4));//false
		System.out.println(s1==s4);//false
		System.out.println(s1.compareTo(s5));
	}

}
