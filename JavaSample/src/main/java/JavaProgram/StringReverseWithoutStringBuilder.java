package JavaProgram;

public class StringReverseWithoutStringBuilder {

	public static void main(String[] args) {

		String input="world";
		String output="";
		String[] arr=input.split("");
		for(int i=arr.length-1;i>=0;i--)
			output=output+arr[i];
		System.out.println(output);
	}
	

}
