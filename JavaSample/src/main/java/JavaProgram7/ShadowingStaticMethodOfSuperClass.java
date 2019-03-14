package JavaProgram7;

class SuperClass2{
	public static void staticMethod(){
		System.out.println("this is the static method of super class!!");
	}
	
	public void nonstaticMethod(){
		System.out.println("this is the non static method of super class!!");
	}
}


class ChildClass2 extends SuperClass2{
	
	
	public static void staticMethod(){
		System.out.println("this is static method of child class!!");
	}
	
	public void nonstaticMethod(){
		System.out.println("this is non static method of child class!!");
	}
}

public class ShadowingStaticMethodOfSuperClass {

	public static void main(String[] args) {

		ChildClass2 c=new ChildClass2();
		c.staticMethod();
		ChildClass2.staticMethod();
		c.nonstaticMethod();
		
		SuperClass2 c2=new ChildClass2();
		c2.staticMethod();
		c2.nonstaticMethod();
	}

}
