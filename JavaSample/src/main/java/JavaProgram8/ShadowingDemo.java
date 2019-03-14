package JavaProgram8;

class SuperClass1{
	public static void print(){
		System.out.println("super class sattic method!!");
	}
}

class SubClass1 extends SuperClass1{
	
	public static void print(){
		System.out.println("sub class static method!!");
	}
}

public class ShadowingDemo {

	public static void main(String[] args) {
		
		SuperClass1 s1=new SuperClass1();
		SuperClass1 s2=new SubClass1();
		SubClass1 sub1=new SubClass1();
		s1.print();
		s2.print();
		sub1.print();

	}

}
