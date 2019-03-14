package JavaProgram;

public class TryCatchWithReturnStatementDemo2 {

	public static void main(String[] args) {

		try {
			System.out.println("try execution!!");
			int i=40/0;
		} catch (Exception e) {
			System.out.println("exception occured!!");
			return;
		}
		finally {
			System.out.println("finally block!!");
		}
		
	}

}
