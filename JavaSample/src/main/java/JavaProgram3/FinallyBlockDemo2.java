package JavaProgram3;

public class FinallyBlockDemo2 {

	public static void main(String[] args) {

		int x=0;
		int y=10;
		
		try {
			System.out.println(y/x);
		} catch (ArithmeticException e) {
			System.out.println("exception catched!!");
		}
		
		System.out.println("this line of code will be executed!!");
		
		
		int r=0;
		int s=10;
		
		try {
			System.out.println(s/r);
		} catch (NullPointerException e) {
			System.out.println("exception catched!!");
		}
		
		System.out.println("this line of code will not be executed!!");
	}

}
