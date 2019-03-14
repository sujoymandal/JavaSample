package JavaProgram;

public class TryCatchWithSystemExit {

	public static void main(String[] args) {

		try {
			System.out.println("try executing!!");
		} catch (Exception e) {
			System.out.println("exception occured!!");
		}
		finally {
			System.out.println("finally block!!");
		}
		
	}

}
