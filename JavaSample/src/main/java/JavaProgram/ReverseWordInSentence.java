package JavaProgram;

public class ReverseWordInSentence {

	public static void main(String[] args) {

		String input="how are you";
		String output="";
		String[] arr=input.split(" ");
		for(String s:arr){
			StringBuilder sb=new StringBuilder(s);
			output=output+sb.reverse()+" ";
		}
		System.out.println(output.trim());
	}

}
