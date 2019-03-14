package JavaProgram8;

public class StringReverse {

	public static void main(String[] args) {

		String s="abcdef";
		System.out.println("String reverse using string buffer!!");
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String reverse=new String(sb);
		System.out.println("Original String = "+s+" And Reversed String = "+reverse);
	
		System.out.println("String reverse using loop!!");
		String output="";
		String[] arr=s.split("");
		for(int i=arr.length-1;i>=0;i--){
			output=output+arr[i];
		}
		System.out.println("Original String = "+s+" And Reversed String = "+output);
	}

}
