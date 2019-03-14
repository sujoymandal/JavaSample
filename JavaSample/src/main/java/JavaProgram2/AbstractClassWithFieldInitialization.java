package JavaProgram2;

abstract class AbstractDemo{
	
	String name;
	public AbstractDemo(String nm){
		this.name=nm;
	}
	
	abstract void print1();
	void print2(){
	
		System.out.println(this.name);
	}
}

class ImplementationDaemo11 extends AbstractDemo{

	public ImplementationDaemo11(String nm) {
		super(nm);
		
	}

	@Override
	void print1() {
		System.out.println("its implemented method!!");
		
	}
	
	
}

public class AbstractClassWithFieldInitialization {

	public static void main(String[] args) {

		ImplementationDaemo11 aa=new ImplementationDaemo11("abc");
		aa.print1();
		aa.print2();
	}

}
