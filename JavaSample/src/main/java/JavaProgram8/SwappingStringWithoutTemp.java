package JavaProgram8;

public class SwappingStringWithoutTemp {

	public static void main(String[] args) {

		String s1="abcd";
		String s2="wxyz";
		s1=s1.concat(s2);
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s1.length()-s2.length());
		
		System.out.println(s1+" and "+s2);
	}

}
