package JavaProgram5;

public class FindingUpperCaseLetter {

	public static void main(String[] args) {

		String s="dabhASdtYiUIOhygtrTWQllk";
		String[] arr=s.split("");
		
		for(String i:arr){
			if(i.equals(i.toUpperCase())){
				System.out.println(i);
			}
		}
	
	}

}
