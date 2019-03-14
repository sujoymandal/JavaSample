package JavaProgram9;

class SuperClass2{
	public void print(){
		System.out.println("print method of SuperClass2 ");
	}
}

class SubClass1 extends SuperClass2{
	
	public void print(){
		System.out.println("print method of SubClass1!!");
	}
	
}

class SubClass2 extends SuperClass2{
	
	public void print(){
		System.out.println("print method of SubClass2!!");
	}
	
}

public class RunTimeMethodDispatchDemo {

	public static void main(String[] args) {

		SuperClass2 super1=new SuperClass2();
		SuperClass2 sub1=new SubClass1();
		SuperClass2 sub2=new SubClass2();
		
		super1.print();
		sub1.print();
		sub2.print();
	}

}
