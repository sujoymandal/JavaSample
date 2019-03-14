package JavaProgram;

public class StringComparisonDemo {

	public static void main(String[] args) {

		String s1="test";
		String s2="test";//its pointing the same object(s1) in string pool
		String s3=new String("test");//it creates new string object in heap
		
		System.out.println(s1==s2);//compares the memory
		System.out.println(s1.equals(s2));//compares the value 
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
