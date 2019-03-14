package JavaProgram;

public class TryCatchFinallyBlock {

	public static void main(String[] args) {

		try {
			System.out.println("try execcution!!");
			System.out.println(20/0);
		} catch (Exception e) {
			System.out.println("exception occured!!");
		}
		finally {
			System.out.println("finally block!!");
		}
	}

}
