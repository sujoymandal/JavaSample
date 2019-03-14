package JavaProgram;

public class SwapingNumberWithoutTemp {

	public static void main(String[] args) {

		int n1=56;
		int n2=90;
		
		 n1=(n1+n2);
		 n2=n1-n2;
		 n1=n1-n2;
		 System.out.println(n1+" and "+n2);
	}

}
