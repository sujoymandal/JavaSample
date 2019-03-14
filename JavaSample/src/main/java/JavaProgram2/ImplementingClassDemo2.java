package JavaProgram2;

public class ImplementingClassDemo2 implements InterfaceWithStaticMethod{

	public static void main(String[] args) {
		ImplementingClassDemo2 c=new  ImplementingClassDemo2();
		c.print();
		c.defaultMethod();
		InterfaceWithStaticMethod.staticMethod();

	}

	@Override
	public void print() {
		System.out.println("its implementing method!!");
		
	}

	@Override
	public void defaultMethod(){
		System.out.println("implementation of default method!!");
	}

//	@Override
//	void staticMethod(){
//		System.out.println("trying to implemnting the satic method");
//	}
}
