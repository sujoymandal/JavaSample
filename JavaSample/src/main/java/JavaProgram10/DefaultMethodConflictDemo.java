package JavaProgram10;

interface InterfaceA{
	default void print(){
		System.out.println("default method of InterfaceA!!");
	}
}


interface InterfaceB{
	default void print(){
		System.out.println("default method of InterfaceB!!");
	}
}

class ClassA implements InterfaceA,InterfaceB{
	public void display(){
		System.out.println("its a class method!!");
	}

	public void print(){
		System.out.println("its overrided!!");
	}
}
public class DefaultMethodConflictDemo {

	public static void main(String[] args) {

		ClassA a=new ClassA();
		a.display();
		a.print();
	}

}
