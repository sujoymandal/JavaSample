package JavaProgram10;

interface InterfaceAA{
	void print();
	abstract void disp();
	default void display(){
		System.out.println("this is default method!!");
	}
	
}

abstract class ClassAA{
	abstract void print1();
}

class Implementing extends ClassAA implements InterfaceAA {

	@Override
	public void print() {
		System.out.println("print method!!");
		
	}

	@Override
	public void disp() {
		System.out.println("disp method!!");
		
	}

	@Override
	void print1() {
		System.out.println("print1 method!!");
		
	}
	
}

public class AbstractClassInterface {

	public static void main(String[] args) {

		Implementing i=new Implementing();
		i.disp();
		i.print();
		i.print1();
		i.display();
	}

}
