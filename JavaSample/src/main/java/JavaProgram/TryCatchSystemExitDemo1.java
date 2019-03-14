package JavaProgram;

public class TryCatchSystemExitDemo1 {

	public static void main(String[] args) {

		try {
			System.out.println("try execution!!");
			System.exit(0);
		} catch (Exception e) {

			System.out.println("exception occured!!");
		}
		finally {
			System.out.println("finally block!!");
		}
	}

}
