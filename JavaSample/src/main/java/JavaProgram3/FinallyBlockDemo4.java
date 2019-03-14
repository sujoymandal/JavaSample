package JavaProgram3;

public class FinallyBlockDemo4 {

	public static void main(String[] args) {

		try {
			System.out.println("execution started!!");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("not comming to exception block!!");
		}
		finally{
			System.out.println("finally block will not be executed!!");
		}
	}

}
