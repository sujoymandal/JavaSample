
public class FinallyDemoClass1 {

	public static void main(String[] args) {

		int x=0;
		int y=10;
		
		try {
			System.out.println(y/x);
		} catch (Exception e) {
			System.out.println("can't divide by zero!!");
		}
		finally{
			System.out.println("this is finally block!!");
		}

		
	}

}
