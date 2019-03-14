package JavaProgram3;

public class StringLiteralAndStringObject {

	public static void main(String[] args) {

		String s1="java";
		String s2="java";//will refer the s1 object
		
		System.out.println(s1.equals(s2));//always return true
		System.out.println(s1==s2);//always return true since its referring the same memory location in string pool
		
		String s3=new String("java");
		String s4=new String("java");//will create new object in heap memory
		
		System.out.println(s3.equals(s4));//returns true
		System.out.println(s3==s4);//return false
		
	}

}
