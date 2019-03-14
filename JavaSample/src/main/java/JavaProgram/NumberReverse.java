package JavaProgram;

public class NumberReverse {

	public static void main(String[] args) {

		int input=7890;
		int output=0;
		while(input!=0){
			int n=input%10;
			output=output*10+n;
			input=input/10;
		}
		System.out.println(output);
	}

}
