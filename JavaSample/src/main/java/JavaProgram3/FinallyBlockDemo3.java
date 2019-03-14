package JavaProgram3;

public class FinallyBlockDemo3 {

	public static void main(String[] args) {

		try {
			System.out.println("try execution");
			System.out.println(20/0);
		} catch (Exception e) {
			System.out.println("exception occured!!");
			return;
		}
		
		finally{
			System.out.println("finally block executed!!");
		}
	}

}
