package JavaProgram;

public class SortString012 {

	public static void main(String[] args) {

		String input="00102220011";
		String zeros="";
		String ones="";
		String twos="";
		
		String[] arr=input.split("");
		for(String s:arr){
			if(s.equals("0"))
				zeros=zeros+s;
			else if(s.equals("1"))
				ones=ones+s;
			else if(s.equals("2"))
				twos=twos+s;
			}
		System.out.println(zeros+ones+twos);
		
	}

}
