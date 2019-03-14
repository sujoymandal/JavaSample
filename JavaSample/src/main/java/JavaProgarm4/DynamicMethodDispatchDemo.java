package JavaProgarm4;

class SuperClass{
	public void superClassMethod1(){
		System.out.println("its the super class method one !!");
	}
	
	public static void superClassMethod2(){//can't be overridden
		System.out.println("its the super class method two !!");
	}
}

class ChildClass1 extends SuperClass{
	
	@Override
	public void superClassMethod1(){
		System.out.println("its a over ridded method of super class in ChildClass1!!");
	}
	
//	public void superClassMethod2(){
//		
//	} will give error
}

class ChildClass2 extends SuperClass{
	
	@Override
	public void superClassMethod1(){
		System.out.println("its a over ridded method of super class in ChildClass2!!");
	}
	
	public void childClassMethod(){
		System.out.println("its a child class methdo!!");
	}
}

public class DynamicMethodDispatchDemo {

	public static void main(String[] args) {

		SuperClass c1;
		ChildClass1 ch1=new ChildClass1();
		c1=ch1;
		
		SuperClass c2;
		ChildClass2 ch2=new ChildClass2();
		c2=ch2;
		
		SuperClass c3=new SuperClass();
		
		c1.superClassMethod1();
		c2.superClassMethod1();
		c3.superClassMethod1();
		c1.superClassMethod2();
		c2.superClassMethod2();
		ch2.superClassMethod1();
		
		((ChildClass2)c2).childClassMethod();
		//((ChildClass1)c2).superClassMethod1();
		
		
		
	}

}
