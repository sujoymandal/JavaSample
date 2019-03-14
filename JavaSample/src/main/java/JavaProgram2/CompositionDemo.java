package JavaProgram2;

class A{
	void methodA(){
		System.out.println("its a method of class A!!");
	}
}

class B{
	void methodB(){
		System.out.println("its a method of class B!!");
	}
}

class C{
	A objA=new A();
	B objB=new B();
	
	void methodA(){
		objA.methodA();
	}
	
	void methodB(){
		objB.methodB();
	}
}

public class CompositionDemo {

	public static void main(String[] args) {

		C objC=new C();
		objC.methodA();
		objC.methodB();
	}

}
