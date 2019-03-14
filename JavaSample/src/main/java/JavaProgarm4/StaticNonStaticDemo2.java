package JavaProgarm4;

class Demo2{
	static {
		System.out.println("this is static block!!");
	}
	{
		System.out.println("this is non static block!!");
	}
	
	public Demo2(){
		System.out.println("this is constructor of Demo2!!");
	}
}

class ChildDemo2 extends Demo2{
	
	public ChildDemo2(){
		System.out.println("this constructor of ChildDemo2!!");
	}
}

public class StaticNonStaticDemo2 {

	public static void main(String[] args) {
		
		ChildDemo2 c=new ChildDemo2();
		
		ChildDemo2 c2=new ChildDemo2();

	}

}
