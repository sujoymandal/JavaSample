package JavaProgram2;

import JavaProgram.PublicInterfaceDemo;

class Demo3 implements PublicInterfaceDemo{

	public void doStuff() {
		
		System.out.println("its a implemneting method of public interface!!");
		
	}
	
}
public class InterfaceDemo3 {

	public static void main(String[] args) {

		Demo3 d3=new Demo3();
		d3.doStuff();
		
	}

}
