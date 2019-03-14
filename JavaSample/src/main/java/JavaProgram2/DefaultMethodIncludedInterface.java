package JavaProgram2;

public interface DefaultMethodIncludedInterface {

	void print();
	default void defaultMethod(){
		System.out.println("its a default method!!");
	}
	
	default void defaultMethod2(){
		System.out.println("its second default method!!");
	}
	
	default void defaultMethodForOverRidden(){
		System.out.println("this  will be overridden!!");
		
	}
}
