package JavaProgram;

public class EleminatingNumbers {

	public static void main(String[] args) {

		String input="w65hwuy7ff789af90oiu";
		char[] arr=input.toCharArray();
		String output="";
		for(char c:arr){
			if(!Character.isDigit(c))
			output=output+c;
		}
		System.out.println(output);
	}

}
