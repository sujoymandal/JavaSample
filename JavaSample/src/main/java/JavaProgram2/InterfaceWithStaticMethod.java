package JavaProgram2;

public interface InterfaceWithStaticMethod {
	
	void print();
	default void defaultMethod(){
		System.out.println("its a default method!!");
	}
	
	static void staticMethod(){
		System.out.println("its a static method in InterfaceWithStaticMethod!!");
	}

}
