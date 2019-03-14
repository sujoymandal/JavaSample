package JavaProgram;

public class TryCatchWithReturnStatementDemo1 {

	public static void main(String[] args) {

		try {
			System.out.println("try execution!!");
			return;
		} catch (Exception e) {
			
			System.out.println("exception occured!!");
		}
		finally {
			System.out.println("finally block!!");
		}
		
	}

}
