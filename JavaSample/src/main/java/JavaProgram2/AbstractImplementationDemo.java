package JavaProgram2;

class ImplementAbstract extends AbstractClassDemo2{

	@Override
	void print1() {
		System.out.println("print1 method implemented!!");
		
	}

	@Override
	void print2() {
		System.out.println("print2 method implemented!!");
		
	}
	
}

public class AbstractImplementationDemo {

	public static void main(String[] args) {
		
		ImplementAbstract ia=new ImplementAbstract();
		ia.print1();
		ia.print2();

	}

}
