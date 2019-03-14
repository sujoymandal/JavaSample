package JavaProgarm4;

class SuperClass1{
	public void superClassMethod(){
		System.out.println("Super Class Method!!");
	}
}

class ChildClassA extends SuperClass1{
	public void superClassMethod(){
		System.out.println("super class method,overridded in child class one!!");
	}
	
	public void childClass1Method(){
		System.out.println("this is child class1 method!!");
	}
}


class ChildClassB extends SuperClass1{
	public void superClassMethod(){
		System.out.println("super class method,overridded in child class two!!");
	}
	
	public void childClass2Method(){
		System.out.println("this is child class2 method!!");
	}
}

public class UpcastingDowncastingDemo {

	public static void main(String[] args) {

		ChildClassA c1=new ChildClassA();
		c1.childClass1Method();
		c1.superClassMethod();
		((SuperClass1)c1).superClassMethod();
		
		
		SuperClass1 c2=new ChildClassB();
		c2.superClassMethod();
		//c2.childClass2Method();//can't access the method of child class since the object reference is of super class
		//need to downcast to access the child class method
		
		((ChildClassB)c2).childClass2Method();//accessing the child class method by down casting
		
		//((ChildClassA)c2).childClass1Method();//will not give compile time error but will throw run time exception
		//ClassCastException
		
		System.out.println(c2 instanceof ChildClassA);//will return false
		
	}

}
