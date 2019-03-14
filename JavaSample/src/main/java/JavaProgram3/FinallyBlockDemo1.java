package JavaProgram3;

import java.io.IOException;

public class FinallyBlockDemo1 {

	public static void main(String[] args)  {

		int x=0;
		int y=10;
		
		try {
			System.out.println(y/x);
		} catch (NullPointerException e) {
			System.out.println("exception is not catched!!");
		}
		finally{
			System.out.println("this is finally block!!");
		}
		
		System.out.println("this line of code will not execute!!");
		
		
	}

}
