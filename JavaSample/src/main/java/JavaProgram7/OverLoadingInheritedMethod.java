package JavaProgram7;

class SuperClass3{
	public void print(){
		System.out.println("super class method!!");
	}
}


class ChildClass3 extends SuperClass3{
	
	@Override
	public void print(){
		System.out.println("this is overridden method!!");
	}
	
	
	public void print(String s){//this is not the overridded methdod
		System.out.println("overloading method!!"+s);
	}
}
public class OverLoadingInheritedMethod {

	public static void main(String[] args) {

		ChildClass3 c3=new ChildClass3();
		c3.print();
		c3.print("hello");

	}

}
