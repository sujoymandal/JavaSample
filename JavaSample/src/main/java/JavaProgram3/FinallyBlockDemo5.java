package JavaProgram3;

public class FinallyBlockDemo5 {

	public static void main(String[] args) {

		try {
			System.out.println("execution started!!");
			System.out.println(20/0);
			System.exit(0);
		} catch (Exception e) {
			System.out.println("will come to exception!!");
		}
		finally{
			System.out.println("will  execute this!!");
		}
		
	}

}
