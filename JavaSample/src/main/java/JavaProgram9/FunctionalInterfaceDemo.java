package JavaProgram9;

@FunctionalInterface
interface FunctionalInterface1{
	void square(int x);
	default void sum(int x,int y) {
		System.out.println(x+y);
	} 
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		FunctionalInterface1 interface1=(int x)->{System.out.println(x*x);};
		
		interface1.square(5);
		interface1.sum(3, 4);
		
	}

}
