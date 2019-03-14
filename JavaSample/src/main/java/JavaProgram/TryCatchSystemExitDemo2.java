package JavaProgram;

public class TryCatchSystemExitDemo2 {

	public static void main(String[] args) {

		try {
			System.out.println("try execution!!");
			int i=20/0;
		} catch (Exception e) {
			
			System.out.println("exception occured!!");
			System.exit(0);
		}
		finally {
			System.out.println("finally block!!");
		}
		
	}

}
