package JavaProgram6;

class SuperClass1{
	
	public void print(){
		System.out.println("this is a super class method!!");
	}
	
	private void privateMethod(){
		System.out.println("this is the private method of super class!!");
	}
	
	protected void protectedMethod(){
		System.out.println("this is the protected method!!");
	}
	
	public void publicMethod(){
		System.out.println("this is the public method of super method!!");
	}
	
	void defaultMethod(){
		System.out.println("its a default method!!");
	}
}

class ChildClass1 extends SuperClass1{
	
	
	public void print()
	{
		System.out.println("this a overridden method!!");
	}
	
	public void useSuperClassMethod(){
		super.print();
		super.publicMethod();
		super.protectedMethod();
		super.defaultMethod();
	}
	
	
}

public class InheritanceDemo1 {

	protected void protectedMethod(){
		System.out.println("this is a protected methdo!!");
	}
	
	void defaultMethod(){
		System.out.println("its a default method!!");
	}
	
	public static void main(String[] args) {

		ChildClass1 ch1=new ChildClass1();
		ch1.print();
		ch1.useSuperClassMethod();
		ch1.publicMethod();
		ch1.protectedMethod();
		ch1.defaultMethod();
	}

}
