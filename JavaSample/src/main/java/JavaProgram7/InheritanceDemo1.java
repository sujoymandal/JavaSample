package JavaProgram7;

class SuperClass1{
	
	public String var1="public";
	private String var2="private";
	String var3="default";
	
	private void method1(){
		System.out.println("this is private method taking public var.."+var1);
	}
	public void method2(){
		System.out.println("this is public method taking private var.."+var2);
	}
}

class ChildClass1 extends SuperClass1{
	
	public void childMethod(){
		System.out.println("capturing public & default member.."+super.var1+" default ->"+super.var3);
	}
	
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		ChildClass1 c=new ChildClass1();
		c.childMethod();
		c.method2();
		System.out.println("super class variables "+c.var1+" and "+c.var3);

	}

}
