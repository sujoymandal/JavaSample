package JavaProgram3;

public class CallingMainMethod {

	public static void main(String[] args) {

		System.out.println("main method of MainMethodToBeCalled is being called!!");
		//MainMethodToBeCalled.main(null);
		String[] s={"abc","xyz"};
		MainMethodToBeCalled.main(s);
		
	}

}
