package JavaProgram2;

public class FinallyBlockDemo6 {

	public static void main(String[] args) {

		try {
			System.out.println("execution staretd!!");
			System.out.println(20/0);
		} catch (Exception e) {
			System.out.println("exception executed!!");
			System.exit(0);
		}
		finally{
			System.out.println("will not execute!!");
		}
	}

}
