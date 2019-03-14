package JavaProgram;

interface Interface1{
	void doPrint();
}

class Demo1 implements Interface1{

	public void doPrint() {

		System.out.println("implementing method doPrint!!");
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {

		Demo1 d1=new Demo1();
		d1.doPrint();
		
	}

}
