package JavaProgram10;

interface Interface1{
	
	void print();
	default void  display(String s){
		System.out.println("printing..."+s);
	}
	
	static void sum(int x,int y) {
		
		System.out.println("sum= "+(x+y));
	}
}

class Class1 implements Interface1{

	@Override
	public void print() {
		System.out.println("printing!!!");
		
	}
	
	void sum(int x,int y){
		Interface1.sum(x, y);
	}
	
}


public class StaticMethdoInInterface {

	public static void main(String[] args) {

		Class1 c1=new Class1();
		c1.display("hello");
		c1.print();
		c1.sum(7, 8);
		
		
	}

}
