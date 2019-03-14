package JavaProgram3;

@FunctionalInterface
interface FunctionalInterfaceDemo4{
	void doSquare(int i);
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		FunctionalInterfaceDemo4 f=(int x)->System.out.println(x*x);
		f.doSquare(5);
		
	}

}
