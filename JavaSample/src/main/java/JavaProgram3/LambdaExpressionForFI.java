package JavaProgram3;

public class LambdaExpressionForFI {

	public static void main(String[] args) {

		int x=10;
		
		FunctionalInterfaceDemo1 d=(int y)->(y*y);
		
		System.out.println(d.doSomething1(x));
		
		FunctionalInterfaceDemo2.staticMethod();
	}

}
