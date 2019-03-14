package JavaProgram;

class Demo2 implements Interface1{

	public void doPrint() {

		System.out.println("implementing interface method!!");
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {

		Demo2 d2=new Demo2();
		d2.doPrint();
	}

}
