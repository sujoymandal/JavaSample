package JavaProgram;

public class Anagram {

	public static void main(String[] args) {

		String s1="abcd";
		String s2="xydc";
		boolean status=true;
		if(s1.length()!=s2.length())
			status=false;
		else
		{
			String[] arr=s1.split("");
			for(String s:arr ){
				if(!s2.contains(s))
					status=false;
					
			}
		}
		
		if(status==true)
			System.out.println("its anagram!!");
		else
			System.out.println("not anagram!!");
	}

}
