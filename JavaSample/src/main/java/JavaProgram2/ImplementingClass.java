package JavaProgram2;

public class ImplementingClass implements DefaultMethodIncludedInterface{

	public static void main(String[] args) {
		
		ImplementingClass c=new ImplementingClass();
		c.print();
		c.defaultMethod();
		c.defaultMethod2();
		c.defaultMethodForOverRidden();
	}

	@Override
	public void print() {
		System.out.println("implementation of DefaultMethodIncludedInterface's method!!");
		
	}
	public void defaultMethodForOverRidden(){
		System.out.println("this default method is overridded in class!!");
	}

}
