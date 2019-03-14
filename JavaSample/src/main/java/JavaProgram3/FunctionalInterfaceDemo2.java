package JavaProgram3;

@FunctionalInterface
public interface FunctionalInterfaceDemo2 {

	default void doSomething2(){
		
		System.out.println("its a default method of functional interface ");
	}
	
	void doWork();
	
	static void staticMethod(){
		
		System.out.println("its a static method of functional interface!!");
	}
}
