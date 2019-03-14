package JavaProgram2;

interface InterfaceDemo1{
	void print();
	default void DefaultMethod(){
		System.out.println("its a default method in InterfaceDemo1!!");
	}
}
interface InterfaceDemo2{
	void print();
	default void DefaultMethod(){
		System.out.println("its a default method in InterfaceDemo2!!");
	}
}

class ChildDemo1 implements InterfaceDemo1,InterfaceDemo2{

	public void print() {
		System.out.println("its implementing in ChildDemo1!!");
	}

	@Override
	public void DefaultMethod() {
		// TODO Auto-generated method stub
		InterfaceDemo1.super.DefaultMethod();
	}
	
	
	
}

class ChildDemo2 implements InterfaceDemo1,InterfaceDemo2{

	public void print() {
		System.out.println("its implementing in ChildDemo2!!");
		
	}

	@Override
	public void DefaultMethod() {
		// TODO Auto-generated method stub
		InterfaceDemo2.super.DefaultMethod();
		InterfaceDemo1.super.DefaultMethod();
	}
	
}

class ExtendClass extends ChildDemo2{//can't extends both classes
	
	public void print1(){
		System.out.println("its not overriding method!!");
		super.print();
	}
}
public class JavaMultipleInheritance {

	public static void main(String[] args) {

		ExtendClass ec=new ExtendClass();
		ec.print();
		ec.print1();
		ec.DefaultMethod();
		
		
	}

}
