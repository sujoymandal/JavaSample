package JavaProgram2;

interface Interface1{
	void print();
}

interface Interface2{
	String print1();
}

class Class1 implements Interface1,Interface2{

	public void print() {
		System.out.println("this is a implementing method!!");
		
	}
	
	public String print1() {
		return "hello";
		
	}
	
}
public class ImplementingTwoInterfaces {

	public static void main(String[] args) {

		Class1 c1=new Class1();
		c1.print();
		System.out.println(c1.print1());
	}

}
