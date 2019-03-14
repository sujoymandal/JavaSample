package JavaProgram2;

public class HandleRunTimeExceptionDemo {

	public static void main(String[] args) {

		int x=0;
		int y=10;
		try {
			System.out.println(y/x);
		} catch (Exception e) {
			System.out.println("cann't divide by zero!!!");
		}
		
	}

}
