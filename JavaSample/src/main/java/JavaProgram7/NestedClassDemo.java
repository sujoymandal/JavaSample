package JavaProgram7;

class WrappedClass{
	
	class Nested1{
		public void nestedMethod(){
			System.out.println("nested method of non static class!!");
		}
	}
	
	static class Nested2{
		public void nestedMethod2(){
			System.out.println("nested method of static class!!");
		}
	}
}


public class NestedClassDemo {

	public static void main(String[] args) {

		WrappedClass.Nested2 n2=new WrappedClass.Nested2();
		
		n2.nestedMethod2();
		
		WrappedClass c=new WrappedClass();
		WrappedClass.Nested1 n1=c.new Nested1();
		
		n1.nestedMethod();
	}

}
